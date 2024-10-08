package CodeSetH;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemoval {
    public static int[] ByHashSet(int[] arr){
        Set<Integer> noRep = new HashSet<Integer>();
        for(int x : arr){
            noRep.add(x);
        }
        int[]newArr = new int[noRep.size()];
        int i = 0;
        for(int x : noRep){
            newArr[i] = x;
            i++;
        }
        return newArr;
    }
    public static int[] ByLogic(int[] arr){
        int[] cnt = new int[128] ;
        for(int i = 0 ; i < arr.length ; i++){
            cnt[arr[i]]++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int x : arr){
            if(cnt[x]>=1){
                al.add(x);
                cnt[x] = 0;
            }
        }
        int size = al.size();
        int[] newArr = new int [al.size()];
        int i =0 ;
        for(int x : al){
            newArr[i] = x;
            i++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length : ");
        int len = sc.nextInt();
        int[]arr = new int[len];
        System.out.println("Enter Elements : ");
        for(int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
        }
        int[] byHash = ByHashSet(arr);
        int[] byLogic = ByLogic(arr);
        System.out.println("By hash collection : ");
        for(int x : byHash){
            System.out.print(x+ " ");
        }
        System.out.println("\nBy Logic : ");
        for(int x : byLogic){
            System.out.print(x+ " ");
        }
    }
}
