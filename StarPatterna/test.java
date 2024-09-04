package StarPatterna;
class A{
    int x=0, y=0 , z=0;
    public A(){}
    public A(int a){
        x=a;
    }
    public A(int a, int b){
        x=a;
        y=b;
    }
}
public class test {
    public static void main(String[] args) {
       A a = new A();
       A b  = new A();
    }
}
