import java.util.*;
public class binarySearchArray {

    public static int binarySearch(int numbers[],int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            //comparisions
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70,80,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key: " );
        int key = sc.nextInt();

        System.out.println("index for key is: " +binarySearch(numbers, key));
    }
}
