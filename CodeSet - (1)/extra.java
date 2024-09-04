package TelegramProjects;

public class extra {
    public static void main(String[] args) {
        try{
            int i=10;
            System.out.println("try Block Runs");
        }
        catch(Exception e){
            System.out.println("catch Block Runs");
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally Block Runs");
        }
    }
}
