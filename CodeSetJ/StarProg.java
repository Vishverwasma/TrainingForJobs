package TelegramProjects;

public class StarProg {
    public static void main(String[] args) {
        int cols = 4;
        for(int i=0;i<=cols;i++){
            for(int j=cols-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
