package basics;
public class typeconversion {
    // conversion happens when:
    //a.type compatible
    //b.destination type > source type
    //byte->short->int->float->long->double
    public static void main(String[] args) {
        int a = 25;long b = a;
        System.out.println(b);
    }
}
