import java.util.*;

public class vovelChecker{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Name : ");
String name = sc.next();
System.out.println();
char[] words = name.toLowerCase().toCharArray();
int vovels = 0 , index = 0;
for(char word : words){
if(word=='a' ||word=='e' ||word=='i' ||word=='o' ||word=='u'){
System.out.println(word+" : "+index);
vovels++;
}
index++;
}
System.out.println("Total Number of Vovels in "+name+" is : "+vovels);
}
}