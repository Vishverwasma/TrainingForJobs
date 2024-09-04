package TelegramProjects;
import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        int reparr[] = new int[10];
        int negcnt=0,poscnt=0;
        int i=0,j=0,max=arr[0],secmax=arr[0];
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]<0)
                negcnt++;
            if(arr[i]>0)
                poscnt++;
        }
        int pos[]=new int[poscnt];
        int neg[]=new int[negcnt];
        System.out.println("The Array s Largest Element Is : "+max+" And Second Largest Element Is "+secmax );
        System.out.println(" While The Sequence Of Array Is : ");
        for(i=0;i<arr.length;i++){
            if(arr[i]<0){
                for(j=0;j<negcnt;j++) {
                    neg[j]=arr[i];
                }
            }
            if(arr[i]>=0){
                for(j=0;j<poscnt;j++) {
                    pos[j]=arr[i];
                }
            }
        }
            while(j<negcnt){
                reparr[j]=neg[j];
                j++;
            }
            i=0;
            while(j< arr.length){
                reparr[j]=pos[i];
                j++;i++;
            }
            for(i=0;i< arr.length;i++){
                System.out.print(reparr[i]+" ");
            }
    }
}
