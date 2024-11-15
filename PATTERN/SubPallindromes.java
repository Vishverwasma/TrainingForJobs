package PATTERN;


import java.util.Scanner;

public class SubPallindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word : ");
        String word = sc.next();
        char[] letters = word.toLowerCase().toCharArray();
        System.out.println("This is a Pallindrome : ");
        for(int i = 0 ; i < word.length()-1 ; i++){
            for(int j = i+1 ; j < word.length() ; j++){
                int k = i , l = j , cnt = 0;
                while(k<=l){
                    if(letters[k]!=letters[l]){
                        cnt = 1;
                        break;
                    }
                    k++;l--;
                }
                if(cnt==0){
                    for(int m = i ; m <= j ; m++){
                        System.out.print(letters[m]+" ");
                    }
                }
            }
        }
        sc.close();
    }
}
