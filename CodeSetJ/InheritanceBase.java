package TelegramProjects;

public class InheritanceBase {
    int d;
    public InheritanceBase(){}
    public InheritanceBase( int d ){
        this.d=d;
    }
    public int getD() {
        return d;
    }
    public int Square(int d){
        d=d*d;
        System.out.println(d*d);
        return d;
    }
    public void setD(int d) {
        this.d = d;
    }
}
