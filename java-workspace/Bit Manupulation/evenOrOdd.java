import java.util.*;
public class evenOrOdd {
    public static void checkEvenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("it is even");
        }else {
            System.out.println("it is odd");
        }
    }
    public static void main(String args [] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        checkEvenOrOdd(n);
        sc.close();
    }    
}
