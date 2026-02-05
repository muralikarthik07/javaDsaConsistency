import java.util.*;
public class sumOfDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        System.out.println(sumOfDigit(number));
    }

    public static int sumOfDigit(int n){
        int sumnum = 0;

        while(n != 0){
            int revnum = n % 10;
            sumnum = sumnum + revnum; 
            n/=10;
        }
        return sumnum;
    }
}
