package CodeSetSeedIT;

public class OddEvenPrimeRunnable implements Runnable{
    @Override
    public void run() {
        String nm = Thread.currentThread().getName();
        nm = nm.toLowerCase();
        int priority = Thread.currentThread().getPriority();
        if(nm.equals("even")){
            for(int i = 0 ; i < 10 ; i++){
                System.out.println("In Thread to Perform "+nm+" with prioity "+priority);
                if(i%2==0){
                    System.out.println("Even number : "+i);
                }
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }else if(nm.equals("odd")){
            for(int i = 0 ; i < 10 ; i++){
                System.out.println("In Thread to Perform "+nm+" with prioity "+priority);
                if(i%2!=0){
                    System.out.println("Odd Number : "+i);
                }
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }else if(nm.equals("prime")){
            for(int i = 0 ; i < 10 ; i++){
                System.out.println("In Thread to Perform "+nm+" with prioity "+priority);
                int cnt = 0;
                for(int j = 2 ; j <= i/2 ; j++){
                    if(i%j==0){
                        cnt = 0;
                        break;
                    }
                    cnt++;
                }
                if(cnt!=0){
                    System.out.println("Prime Number : "+i);
                }else{
                    System.out.println("Non Prime Number : "+i);
                }
                try{
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        OddEvenPrimeRunnable op = new OddEvenPrimeRunnable();

        Thread t1 = new Thread(op);
        Thread t2 = new Thread(op);
        Thread t3 = new Thread(op);

        t1.setName("Odd");
        t1.setPriority(3);
        t2.setName("Even");
        t2.setPriority(5);
        t3.setName("Prime");
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
    }
}
