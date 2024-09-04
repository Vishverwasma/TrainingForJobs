package TelegramProjects;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class redundantData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Size of Element / Array : ");
        n = sc.nextInt();
        int[] a = new int[n];
        int i,j,k,cnt=0;
        System.out.println("Enter Elements : ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Set<Integer> s = new HashSet<>();
        for(i=0;i<n-1;i++){
            k=i;
            for(j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    cnt++;
                }
            }
            while(k>=0) {
                if (a[k] == a[i]) {
                    cnt--;
                }
                k--;
            }
            if(cnt>0){
                s.add(a[i]);
            }
            cnt=0;
        }
        System.out.println("Redundant Data : ");
        for(int red : s){
            System.out.println(red);
        }
    }
}
