package CodeSetSeedIT;

class Odd extends Thread{
    public void run(){
         for(int i = 0 ; i < 10 ; i++){
             if(i%2 != 0){
                 System.out.println("Number "+i+" is Odd!");
             }
             try{
                 Thread.sleep(1000);
             }catch(Exception e){
                 e.printStackTrace();
             }
         }
    }
}
class Even extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            if(i%2 == 0){
                System.out.println("Number "+i+" is Even!");
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Prime extends Thread{
    public void run(){
        for(int i = 1 ; i <= 30 ; i++){
            int cnt = 0;
            for(int j = 2 ; j <= i/2 ;j++){
                if(i%j==0){
                    cnt=0;
                    break;
                }
                cnt++;
            }
            if(cnt!=0){
                System.out.println(i+" is Prime Number");
            }else{
                System.out.println(i+" is not a Prime Number");
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class OddEvenPrime {
    public static void main(String[] args) {
        Odd o = new Odd();
        Even e =new Even();
        Prime p = new Prime();
        o.start();
        e.start();
        p.start();
    }
}
