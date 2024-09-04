package TelegramProjects;
import java.util.*;
public class TataTechnologies {
    public class Main {

        public static int countZeroPosition(int[] arr) {
            // Your implementation for counting zero positions goes here
            int i=0 , cnt=0 , sum=0;
            for(i=0;i<arr.length;i++){
                sum=sum+arr[i];
                if(sum==0){
                    cnt++;
                }
            }
            return cnt;
        }

        public static void main(String[] args) {
            // Input array
            int[] arr = {1, -1, 1, 1, -1, -1, 1, 1, -1};

            // Call the function to count zero positions
            int zeroPositionCount = countZeroPosition(arr);

            // Output the result
            System.out.println("Number of times it reaches zeroth position: " + zeroPositionCount);
        }
    }

}
