package CodeSetSeedItSortings;

import java.util.Scanner;

public class Sorting {
    static Scanner sc = new Scanner(System.in);

    public void insertValuesInArray(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
    }
    public void showArray(int [] arr){
        for(int n : arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[]arr){
        for(int i = 0 ; i < arr.length ;i++){
            int smallest = i;
            int index = 0;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest] ;
            arr[smallest] = arr[i] ;
            arr[i] = temp ;
        }
    }
    public static void insertionSort(int[]arr){
        for(int i = 1 ;  i<arr.length ; i++){
            int current = arr [i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void mergeSort(int[]arr){
        divideForMergeSort(arr , 0 , arr.length-1);
    }
    public static void divideForMergeSort(int[]arr , int startIndex , int endIndex){
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex-startIndex)/2;
        divideForMergeSort(arr,startIndex,mid);
        divideForMergeSort(arr,mid+1,endIndex);
        conquerForMergeSort(arr,startIndex,mid,endIndex);
    }
    public static void conquerForMergeSort(int[]arr , int startIndex , int mid , int endIndex){
        int merger[] = new int[endIndex-startIndex+1];
        int index01 = startIndex;
        int index02 = mid+1;
        int x = 0;
        while(index01<=mid && index02<=endIndex){
            if(arr[index01]<= arr[index02]){
                merger[x++] = arr[index01++];
            }else{
                merger[x++] = arr[index02++];
            }
        }
        while(index01 <= mid){
            merger[x++] = arr[index01++];
        }
        while(index02 <= endIndex){
            merger[x++] = arr[index02++];
        }
        int j = startIndex;
        for(int element : merger){
            arr[j] = element;
            j++;
        }
    }
    public static void quickSort(int[]arr,int low,int high){
        if(low<high){
            int pivotIndex = partitionForQuickSort(arr , low , high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    public static int partitionForQuickSort(int[]arr,int low,int high){
        int pivotValue = arr[high];
        int i = low-1;
        for(int j = low ; j < high ; j++){
            if(arr[j]<pivotValue){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivotValue;
        arr[high] = temp;
        return i;
    }
    public static void backTrackingSort(int[]arr){{

    }

    }
    public static void main(String[] args){
        System.out.println("Size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];

        Sorting obj = new Sorting();
        obj.insertValuesInArray(arr);
        System.out.println("\nDefault sequence of elements in this array is : \n");
        obj.showArray(arr);
        System.out.println("Opt for Sorting Technique we want to use for Sorting : \n 1. Bubble sort\n 2. Selection sort\n 3. Insertion sort\n 4. Merge sort\n 5. Quick sort\n 6. Using Recursion(BackTracking)");
        System.out.println("\n Your Choice : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("\nOn Sorting using Bubble Sort it becomes : ");
                bubbleSort(arr);
                obj.showArray(arr);
                break;
            case 2:
                System.out.println("\nOn Sorting using Selection Sort it becomes : ");
                selectionSort(arr);
                obj.showArray(arr);
                break;
            case 3:
                System.out.println("\nOn Sorting using Insertion Sort it becomes : ");
                insertionSort(arr);
                obj.showArray(arr);
                break;
            case 4:
                System.out.println("\nOn Sorting using Merge Sort it becomes : ");
                mergeSort(arr);
                obj.showArray(arr);
                break;
            case 5:
                System.out.println("\nOn Sorting using Quick Sort it becomes : ");
                quickSort(arr , 0 , arr.length-1);
                obj.showArray(arr);
                break;
            case 6:
                System.out.println("\nOn Sorting using Recursion/Backtracking it becomes : ");
                backTrackingSort(arr);
                obj.showArray(arr);
                break;
            default:
                System.out.println("Seems you didn't choose among choice so going with Bubble Sort!\nOn Sorting using Bubble Sort it becomes : ");
                bubbleSort(arr);
                obj.showArray(arr);
                break;
        }
    }
}
