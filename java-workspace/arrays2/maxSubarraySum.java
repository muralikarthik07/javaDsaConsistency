package arrays2;
import java.util.*;

public class maxSubarraySum {
    public static void maxSubArraySum(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = Integer.MIN_VALUE;


        for(int i = 0;i < num.length; i++){
            int start = i;
            for(int j= i; j< num.length; j++){
                int end = j;
                currSum = Integer.MIN_VALUE;
                for(int k=start; k<end; k++){
                     System.out.print(num[k]+ " ") ;
                }
               System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        int num[] = {2, 4, -3, 5, -4};
        maxSubArraySum(num);

    }
    
}
