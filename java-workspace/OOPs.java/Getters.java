public class Getters {
    public static void main(String [] args){
        vechile v = new vechile();
        System.out.println(v.getRate());
    }
}

class vechile {
    private int rate = 500000;
    public int getRate(){
        return rate;
    }
}