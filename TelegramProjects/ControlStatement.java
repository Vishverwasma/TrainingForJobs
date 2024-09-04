package TelegramProjects;

public class ControlStatement {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println("Continue Statement for i = "+i);
                continue;
            }
            System.out.println("Continue Doesnt Work for i = "+i);
        }
    }
}
