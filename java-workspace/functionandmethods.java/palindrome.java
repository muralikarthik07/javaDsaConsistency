import java.util.*;
public class palindrome {

    public static int palindromenumcheck(int n){
        int x = n;//121
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int rev = palindromenumcheck(n);
        if(n == rev){
            System.out.println("is a palindrome");;
        }else{
            System.out.println("is not a palindrome");
        }
    }
}
