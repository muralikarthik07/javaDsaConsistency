package basics;
import java.util.*;
public class sumof {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Sum of two numbers
        System.out.println("Sum of two numbers");
        System.out.println("please enter value of a:");
        int a = sc.nextInt();
        System.out.println("please enter value of b:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is:");
        System.out.println(sum);

        System.out.println("-------------------------------------------------------------------------");

        //Product of two numbers
        System.out.println("Product of two numbers");
        System.out.println("please enter value of c:");
        int c = sc.nextInt();
        System.out.println("please enter value of d:");
        int d = sc.nextInt();
        int product = c * d;
        System.out.println("The product is:");
        System.out.println(product);

        //Circle
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area); 
        

    }
}
