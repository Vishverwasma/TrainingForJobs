package CodeSetSeedIT;

public class TicketSynchronized implements Runnable{
    int i = 0;
    public synchronized void run(){
        int n = i;
        while(i<=n+10){
            i++;
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TicketSynchronized o = new TicketSynchronized();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);
        Thread t3 = new Thread(o);
        Thread t4 = new Thread(o);
        Thread t5 = new Thread(o);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        t5.setName("Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
