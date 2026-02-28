import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int rev = 0;
        while(n!=0){
            int digital = n % 10;
            rev = rev * 10 + digital;
            n = n / 10;
        }
        if(n == rev){
            System.out.println("entered number is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
