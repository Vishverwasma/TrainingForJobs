package CodeSetI;

import java.util.*;

public class ArrayWithElementsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array  size : ");
        int len = sc.nextInt();
        System.out.println("Elements : ");
        int[] arr = new int[len];
        for(int i = 0 ; i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target Sum : ");
        int target = sc.nextInt();
        Map<Integer , Integer> noRep = new HashMap<>();
        int i = 0;
        for(int num : arr){
            noRep.put(i,num);
            i++;
        }
        System.out.println("The repeating elements are removed and new array is made ...");
        int[] newArr = new int[noRep.size()];
        for(int j = 0 ;  j < noRep.size() ; j++){
            newArr[j] = noRep.get(j);
        }
        System.out.println("Now elements whose sum equals target are : ");
        sumFromElements(newArr ,0 , target);
    }

    private static void sumFromElements(int[] arr,int index , int target) {
        if(index==arr.length-1){
            return;
        }
        for(int i = index ; i< arr.length;i++){
            if(arr[index]+arr[i]==target){
                System.out.println(arr[index]+" + "+arr[i]+" = "+target);
            }
        }
        sumFromElements(arr,index+1,target);
    }
}
