package TelegramProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int n,i=0,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n = sc.nextInt();
        a=n;
        int arr[] = new int[10];
        while(a!=0){
            b=a%10;
            arr[i]=b;
            i++;
            a=a/10;
        }
        StringBuilder array  =new StringBuilder();
        Arrays.sort(arr);
        for(i=arr.length-1;i>=0;i--){
            array.append(arr[i]);
        }
        int c=0;
        for(i=arr.length-1;i>=0;i--){
            c=c*10+arr[i];
        }
        System.out.println(array+"  is the largest number possible to be made ! & "+c);
    }
}
