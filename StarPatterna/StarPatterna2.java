package StarPatterna;

public class StarPatterna2 {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}