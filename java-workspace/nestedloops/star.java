import java.util.*;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of lines:");
        int line = sc.nextInt();

        for(int i = 1;i<=line;i++){
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
