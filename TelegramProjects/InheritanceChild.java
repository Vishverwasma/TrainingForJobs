package TelegramProjects;

public class InheritanceChild extends InheritanceBase{
    int d;
    public InheritanceChild(int d){
        super();
    }
    @Override
    public int Square(int d){
        System.out.println(d);
        super.Square(d);
        return d;
    }

    public static void main(String[] args) {
        int d=10;
        InheritanceChild ic=new InheritanceChild(d);
        System.out.println(ic.Square(d));
    }
}
