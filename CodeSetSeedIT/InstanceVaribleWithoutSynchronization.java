package CodeSetSeedIT;

public class InstanceVaribleWithoutSynchronization implements Runnable{
    int i = 1;
    public void run(){
        while(i<=10){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            i++;
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        InstanceVaribleWithoutSynchronization o =new InstanceVaribleWithoutSynchronization();
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

        System.out.println("\n");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
