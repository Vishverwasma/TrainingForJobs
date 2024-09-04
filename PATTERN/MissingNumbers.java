package PATTERN;

import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array : ");
        int size = sc.nextInt();
        System.out.println("Enter an Array : ");
        int [] array = new int [size];
        for(int i =0 ;i<size ; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Missign Numbers are : ");
        int missing =0;
        for(int i = 0 ; i < size-1 ; i++){
                missing = array[i+1]-array[i];
                if(missing>1){
                    int miss =0;
                    System.out.println("Between : "+array[i]+" and "+array[i+1] +" : " );
                    while(missing!=0){
                        miss = array[i]+missing;
                        missing--;
                        if(miss==array[i+1]){
                            System.out.print("");
                        }else {
                            System.out.print(miss + " ");
                        }
                    }
                    System.out.println();
                }
        }
    }
}
