import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();

        int a = 0, b = 1;
        if(n>=0){
            System.out.println(a + " ");
        }
        if(n>=1){
            System.out.println(b + " ");
        }

        for(int i=3; i<=n; i++){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
    }
}
