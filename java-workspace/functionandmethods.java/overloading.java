public class overloading {

    // function overloading with parameters
    public static int sum(int a, int b){
        return a+b;
    }
    // function overloading with parameters
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    //function overloading using data types
    public static int sums(int a, int b){
        return a+b;
    }
    //function overloading using data types
    public static float sums(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        // function overloading with parameters
        System.out.println(sum(3,5));
        // function overloading with parameters
        System.out.println(sum(3,2,3));

        //function overloading using data types
        System.out.println(sums(8,9));
        //function overloading using data types
        System.out.println(sums(8f,9f));
        
    }
}
