package CodeSetSeedIT;

public class MultiThreadingDemo02 extends Thread {
    public void run(){
        for(int i = 0 ; i <= 10 ; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultiThreadingDemo02 x = new MultiThreadingDemo02();
        MultiThreadingDemo02 y = new MultiThreadingDemo02();
        x.start();
        y.start();
    }
}
