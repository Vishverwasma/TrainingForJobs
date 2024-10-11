package CodeSetSeedIT;

public class InfiniteReadWrite implements Runnable{
    String message = "";
    int i = 1;
    boolean contextToRead = false ;
    public synchronized void run(){
        String name = Thread.currentThread().getName().toLowerCase();
        while(true){
            String context = new String("Context for Thread "+i);
            if(name.equals("reading")){
                reader(context);
            }else if(name.equals("writing")){
                writer(context);
            }
            i++;
        }
    }
    public synchronized void writer(String str){
        System.out.println("Writer -->");
        while(contextToRead){
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Writing ! ");
        message = str;
        System.out.println("He Wrote : "+message);
        contextToRead = true;
        notify();
    }
    public synchronized void reader(String str){
        System.out.println("Reader --> ");
        while(!contextToRead){
            if(message.equals("")){
                System.out.println("\nLet The Writer for this Thread Write Something!");
                try{
                    wait();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        message = str;
        System.out.println("So the Writer wrote something! Lets See What it is ---> ");
        System.out.println(message);
        contextToRead = false;
        notify();
    }
    public static void main(String[] args) {
        InfiniteReadWrite o = new InfiniteReadWrite();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);

        t1.setName("Reading");
        t2.setName("Writing");

        t1.start();
        t2.start();
    }
}
