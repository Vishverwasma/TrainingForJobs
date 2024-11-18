import java.util.*;

public class vovelCheckerUsingHashMap{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Name : ");
String name = sc.next();
System.out.println();
char[] words = name.toLowerCase().toCharArray();
Map<Character,Integer> nameWord = new HashMap<>();
int vovels = 0 , index = 0,count = 0;
for(char word : words){
if(word=='a' ||word=='e' ||word=='i' ||word=='o' ||word=='u'){
if(nameWord.get(word)==null){
nameWord.put(word,1);
}else{
nameWord.put(word,nameWord.get(word)+1);
}
vovels++;
}
index++;
}
for(char word : words){
if(nameWord.get(word)!=null){
System.out.println(word+" : "+nameWord.get(word));
}
}
System.out.println("Total Number of Vovels in "+name+" is : "+vovels);
}
}