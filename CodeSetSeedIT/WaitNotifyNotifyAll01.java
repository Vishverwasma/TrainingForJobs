package CodeSetSeedIT;

public class WaitNotifyNotifyAll01 implements Runnable {
    public int totalAmount = 0;
    //public static boolean withdrawn = false;

    public synchronized void run(){
         String n = Thread.currentThread().getName().toLowerCase();
             if(n.equals("withdrawer")) {
                 withdraw(5000);
             }else if(n.equals("despositor")){
                 deposit(6000);
             }
     }
     public synchronized void withdraw(int amount){
         System.out.println("Here to Withdraw --> ");
         if(amount>totalAmount) {
             System.out.println("Withdrawal amount is greater than amount in account by "+(amount - totalAmount)+", so putting thread to wait !");
             try {
                 wait();
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
         System.out.println("Withdrawal Condition met ! ---> ");
         totalAmount = totalAmount - amount;
             //withdrawn  = true;
         System.out.println("New Balanace in your account : "+totalAmount);

     }
     public synchronized void deposit(int amount){
         System.out.println("Here to Deposit --> ");

         totalAmount = totalAmount + amount;
         System.out.println("Depositor Is Depositing amount of "+amount);
         System.out.println("So new Balance is : "+totalAmount);
         notify();
     }
    public static void main(String[] args) {
        WaitNotifyNotifyAll01 o = new WaitNotifyNotifyAll01();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);

        t1.setName("Withdrawer");
        t2.setName("Despositor");

        t1.start();
        t2.start();
    }
}
