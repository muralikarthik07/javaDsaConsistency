import java.util.*;
public class checkfactorial {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enyer the number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }
}
