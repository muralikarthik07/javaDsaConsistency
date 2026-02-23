package Strings;
import java.util.*;

public class palindrome {
    public static boolean palindromes(String name){
        for(int i=0; i<name.length()/2; i++){
            int n = name.length();
            if(name.charAt(i) != name.charAt(n-1-i)){
                return false;
            };
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        palindromes(name);
        boolean result = palindromes(name);
        System.out.println(result);        
        sc.close();
    }
}
