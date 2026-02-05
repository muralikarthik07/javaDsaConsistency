package loops;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which table you need:");
        int table = sc.nextInt();

        for(int i = 1; i<= 10;i++){
            System.out.println(+table+" * " +i+ "=" +table*+i);
        }
    }
}
