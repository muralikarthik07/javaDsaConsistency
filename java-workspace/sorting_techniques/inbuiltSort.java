
import java.util.*;
public class inbuiltSort {

    public static void printArray(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,7,4,9,1,0,4};
        printArray(arr);
    }
}
