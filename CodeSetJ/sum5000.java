package TelegramProjects;

public class sum5000 {
    public static void main(String[] args) {
        int i,sum=0;
        for(i=1;i<=5000;i++){
            if(i%2==0){
                System.out.print(i+" + ");
               sum=sum+i;
            }
        }
        System.out.println("Sum of all Even numbers till 5000 is : "+sum);
    }
}
