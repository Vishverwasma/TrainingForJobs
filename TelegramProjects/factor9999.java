package TelegramProjects;

public class factor9999 {

    public static void main(String[] args) {
        int i,j;
        boolean isPrime;
        for(i=1;i<=9999;i++){
            isPrime=true;
            if(9999%i==0){
                for(j=2;j<=i/2;j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }
                // If the factor is prime, print it
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }
}
