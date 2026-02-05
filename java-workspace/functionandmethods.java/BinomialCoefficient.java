public class BinomialCoefficient {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int binomialCoff(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int z_fact = factorial(n-r);

        int bincoff = n_fact / (r_fact*z_fact);
        return bincoff;
    }
    public static void main(String[]args){
        System.out.println(binomialCoff(8, 3));
    }
}
