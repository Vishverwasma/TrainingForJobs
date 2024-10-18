package CodeSetSeedIT;

public class Infi implements Runnable{
    int num = 0 , chk = 0;
    public synchronized void run(){
            String name = Thread.currentThread().getName().toLowerCase();
            if (name.equals("t1")) {
                write();
            } else if (name.equals("t2")) {
                read();
            }

    }
    public synchronized void write(){
        while(true) {
            if(chk!=num){
                try{
                    wait();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            num++;
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("Writing : " + num);
            notify();
        }
    }
    public synchronized void read(){
        while(true) {
            if (chk == num) {
                try {
                    notify();
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Reading : " + num);
            chk = num;
        }
    }

    public static void main(String[] args) {
        Infi obj = new Infi();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
