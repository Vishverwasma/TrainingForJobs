package TelegramProjects;

public class CharToString {
    public static void main(String[] args) {
        char[] c = new char[]{'V','i','s','h','w','a','s'};
        String[] s = new String[c.length];
        int i=0;
        for(char cs : c){
            s[i]= String.valueOf(cs);
            i++;
        }
        System.out.println("Value in String s is ");
        for(String sp : s){
            System.out.print(sp);
        }
    }
}
