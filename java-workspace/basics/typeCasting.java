package basics;
import java.util.*;
public class typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.9999f;
        int b = (int)a;
        System.out.println(b);
    }
}

/* 1.java automatically promotes each byte,short, or char operand to int when evaluating an expression.
 * 2.If one operand is long,float or double the whole expression is promoted to long,float,or double respectively
 */