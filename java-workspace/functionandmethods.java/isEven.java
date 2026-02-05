import java.util.*;
public class isEven {
    public static boolean iEven(int a){
        if((a%2) == 0){
            return true;
            
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the input num:");
        int num = sc.nextInt();
        if(iEven(num)){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
