package CodeSetSeedIT;

public class MultiThreadingdemo01 {
    public void show(){
        for(int i = 0 ;  i <= 10 ; i++){
            System.out.println(i+" ");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultiThreadingdemo01 x = new MultiThreadingdemo01();
        MultiThreadingdemo01 y = new MultiThreadingdemo01();
        x.show();
        y.show();
    }
}
