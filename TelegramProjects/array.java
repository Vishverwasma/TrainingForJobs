package TelegramProjects;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int  a[]={};
        Scanner sc=new Scanner(System.in);
        int i=0;
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0],pos=0;
        for(i=0;i<10;i++){
            if(max<a[i]){
                max=a[i];
                pos=i;
            }
        }
        a[pos]=a[i];
        a[i]=max;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
