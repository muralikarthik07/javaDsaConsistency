package basics;
import java.util.*;
public class averageof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits you want to give:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i <= n;i++){
            System.out.println("enter the number:" + i +":");
            int num = sc.nextInt();
            sum = sum + num;
        }


        double avg = sum /n;
        System.out.println("verage of the given numbers are "+avg+ ":");

    }
}
