import java.util.*;
public class armStrong {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();
        int original = n;
        int temp = n;
        int sum = 0;

        //check how many numbers
        while(n != 0){
            count++;
            temp = temp/10;
        }

        //calculate the armstrong sum
        temp = n;
        while(n != 0){
            int digit = temp % 10;
            sum = sum + Math.pow(digit, count);
            temp = temp / 10;
        }
        //calculate armstrong
        if(original == temp){
            System.out.println("its is armstrong");
        }else{
            System.out.println("no it is not armstrong");
        }

    }
}
