import java.util.*;
public class largestnuminarray {

    public static int largestvalue(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String [] args){
        int numbers[] = {20,30,10,50,40};
        System.out.println("largest value is:" + largestvalue(numbers));
    }
}
