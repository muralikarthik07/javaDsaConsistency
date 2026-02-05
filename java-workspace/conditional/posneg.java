package conditional;
import java.util.*;

public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numner:");
        int num = sc.nextInt();

        //checking positive or negative
        if(num < 0){
            System.out.println( +num +" is a negative number");
        } else {
            System.out.println(+num+" is a positive number");
        }

    }
}