package RailworldTraining.Day16;

public class multiple implements i1,i2,i3,i4 {

    @Override
    public void m1() {
        System.out.println("Hi i am a Method from Interface i1 ");
    }

    @Override
    public void m2() {
        System.out.println("Hi i am a Method from Interface i2 ");
    }

    @Override
    public void m3() {
        System.out.println("Hi i am a Method from Interface i3 ");
    }

    @Override
    public void m4() {
        System.out.println("Hi i am a Method from Interface i4 ");
    }

    public static void main(String[] args) {
        multiple m = new multiple();
        m.m1();
        m.m2();
        m.m3();
        m.m4();
    }
}
