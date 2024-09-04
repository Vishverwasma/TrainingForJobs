package TelegramProjects;

public class Animal {
    private String name;
    private int legs;
    private int eyes;

    public Animal(){}
    public int getEyes() {
        return eyes;
    }

    public int getLegs(int i) {
        return legs;
    }

    public String getName() {
        return name;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal name= " + name  +
                ", legs=" + legs +
                ", eyes=" + eyes ;
    }
}
