package PATTERN;

import java.util.Scanner;

public class SortingAlgorithms {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int OrgArr[]=new int[n];
        for(int i=0;i<n;i++){
            OrgArr[i]=sc.nextInt();
        }
        System.out.println("Elements in Sorted Form is : ");
        System.out.println("..............................");
        System.out.println("1. Bubble Sort\n" +
                "Bubble Sort works by repeatedly stepping through the list to be sorted, comparing adjacent elements and swapping them if they are in the wrong order. This process is repeated until the list is sorted. : ");
        int []arr = OrgArr ;
        int i=0;
        bubbleSort(arr);
        for(int x:arr){
            if(i>0 && i<n-1){
                System.out.print(" , "+x);
            }else{
                System.out.print(x+" , ");
            }
        }
        System.out.println("..............................");
        System.out.println("2. Merge Sort\n" +
                "Merge Sort is a divide-and-conquer algorithm that splits the array into halves, recursively sorts each half, and then merges the sorted halves. : ");

        arr = OrgArr ;
        i=0;
        mergeSort(arr);
        for(int x:arr){
            if(i>0 && i<n-1){
                System.out.print(" , "+x);
            }else{
                System.out.print(x+" , ");
            }
        }
        System.out.println("..............................");
        System.out.println("3. Insertion Sort\n" +
                "Insertion Sort builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. : ");

        arr = OrgArr ;
        i=0;
        InsertionSort(arr);
        for(int x:arr){
            if(i>0 && i<n-1){
                System.out.print(" , "+x);
            }else{
                System.out.print(x+" , ");
            }
        }
        System.out.println("..............................");
        System.out.println("4. Selection Sort\n" +
                "Selection Sort repeatedly selects the minimum element from the unsorted part of the array and swaps it with the first unsorted element. : ");

        arr = OrgArr ;
        i=0;
        SelectionSort(arr);
        for(int x:arr){
            if(i>0 && i<n-1){
                System.out.print(" , "+x);
            }else{
                System.out.print(x+" , ");
            }
        }
        System.out.println("..............................");
        System.out.println("5. Heap Sort\n" +
                "Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It's similar to selection sort where we first find the maximum element and place it at the end. We repeat the same process for the remaining elements. : ");

        arr = OrgArr ;
        i=0;
        HeapSort(arr);
        for(int x:arr){
            if(i>0 && i<n-1){
                System.out.print(" , "+x);
            }else{
                System.out.print(x+" , ");
            }
        }
    }
    public static void bubbleSort(int[] arr){
        int temp;
        for(int i= arr.length-1;i>=0;i--){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void mergeSort(int[] arr){
        if(arr.length<2){
            return;
        }
        int mid = arr.length/2;
        int[] left=new int[mid];
        int[] right=new int[arr.length-mid];
        for(int i = 0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int i = mid;i< arr.length;i++){
            right[i-mid]=arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    public static void merge(int[]arr,int[]left,int[]right){
        int i=0,j=0,k=0;
        while(i< left.length && j< right.length){
            if(left[i]<=right[i]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i< left.length){
            arr[k++]=left[i++];
        }
        while(j< right.length){
            arr[k++]=right[j++];
        }
    }
    public static void InsertionSort(int[] arr){
        for(int i = 1 ; i< arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void SelectionSort(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void HeapSort(int[] arr){
        int n = arr.length;
        // Top build Max Heap
        for(int i = n/2 - 1;i>=0;i--){
            heapify(arr,n,i);
        }
        // Extract elements from Heap one by one
        for(int i = n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i] = temp;

            // Heapify the root elements to get the highest element at root again
            heapify(arr,i,0);
        }
    }
    public static void heapify(int[] arr,int n,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }
}
