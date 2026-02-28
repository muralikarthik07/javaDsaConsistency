import java.util.*;
public class ReverseNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();

        int rev = 0;
        while(n!= 0){
            int digital = n % 10;
            rev = rev * 10 + digital;
            n = n/10;
        }
        System.out.println(rev);
    }
}
