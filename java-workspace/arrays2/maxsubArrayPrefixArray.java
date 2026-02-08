package arrays2;
public class maxsubArrayPrefixArray {
    public static void maxSubarraySum(int array[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixArray[] = new int[array.length];

        //calculate prefix array
        prefixArray[0] = array[0];
        for(int i = 1; i<prefixArray.length; i++){
            prefixArray[i] = prefixArray[i-1] + array[i];
        }
        
        for(int i=0; i<array.length; i++){
            int start = i;
            for(int j=i; j<array.length; j++){
                int end = j;

                //line important
                currSum = start == 0? prefixArray[end] : prefixArray[end] - prefixArray[start - 1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        maxSubarraySum(array);
    }
}







