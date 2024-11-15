package PATTERN;

import java.util.Scanner;

public class PatternUsingArrayOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Number of Rows : ");
        int row = sc.nextInt();
        int[][] arr = new int[row][];
        int [] cols = new int[row];
        for(int i = 0 ; i < row ; i++){
            System.out.println("Number of Columns : ");
            int col = sc.nextInt();
            arr[i]=new int[col];
            cols[i] = col;
        }
//        System.out.println("Enter Elements in this array : ");
//        for (int i = 0 ; i < row ; i++){
//            if(i==row-1){
//                System.out.println("This is the last row with columns "+cols[i]);
//            }
//            for(int j = 0 ; j < cols[i] ; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
        int m = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < cols[i] ; j++){
                 m++;
                 arr[i][j] = m;
            }
        }
        System.out.println("Elements in this array are : ");
        for(int[] x : arr){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
