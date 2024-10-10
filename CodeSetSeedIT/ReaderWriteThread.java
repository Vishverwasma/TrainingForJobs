package CodeSetSeedIT;

public class ReaderWriteThread implements Runnable{
    String message = "";
    static Thread t1 , t2;
    public synchronized void reader(String str){
        if(str.equals("")){
            System.out.println("A reader need some context to read , but this seems empty !");
            try{
                wait();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Seems Writer has writen a message ! ");
        message = str;
        System.out.println("<-------------------->");
        System.out.println("Message : "+message);
        running();
    }
    public synchronized void writer(String str){
        System.out.println("Welcome Writer!A reader is waiting for message ! ");
        message = str;
        System.out.println("<-------------------->");
        notify();
    }
    public static void running(){
        t1.start();
        t2.start();
    }
    public synchronized void run(){
        String user = Thread.currentThread().getName().toLowerCase();
        int i = 1;
        if(user.equals("writer")){
            message = "Context from writer "+i;
            writer(message);
            i++;
        }else if(user.equals("reader")){
            reader(message);
        }
    }

    public static void main(String[] args) {
        ReaderWriteThread o = new ReaderWriteThread();
        t1 = new Thread(o);
        t2 = new Thread(o);

        t1.setName("Reader");
        t2.setName("Writer");

        running();
    }
}
