package arrays2;
import java.util.*;

public class maxSubarraySum {
    public static void maxSubArraySum(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;


        for(int i = 0;i < num.length; i++){
            int start = i;
            for(int j= i; j< num.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += num[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                System.out.println(currSum);
            }
            System.out.println("max sum is: " +maxSum);
        }
    }
    public static void main(String args []){
        int num[] = {2, 4, -3, 5, -4};
        maxSubArraySum(num);

    }
    
}
