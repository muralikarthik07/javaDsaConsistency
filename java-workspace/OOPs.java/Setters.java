public class Setters {
    public static void main(String[] args){
        vechile v = new vechile();
        v.setRate(600000);
        System.out.println(v.getRate());
    }
}

class vechile {
    private int rate = 500000;
    private String name = "royal enfield";

    public void setRate(int r){
        if(r > 0 ){
            this.rate = r;
        }
    }

    public int getRate(){
        return rate;
    }
}
