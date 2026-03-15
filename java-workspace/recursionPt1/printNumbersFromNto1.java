public class printNumbersFromNto1{
    public static void main(String [] args){
        int n = 10;
        printNumber(n);
    }

    public static void printNumber(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n+ " ");
        printNumber(n-1);
    }
}