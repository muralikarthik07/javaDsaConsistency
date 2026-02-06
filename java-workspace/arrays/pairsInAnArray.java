public class pairsInAnArray {
    public static void pairsInAnArrayy(int numbers[]){
        int numOfPairs = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                int secondnum = numbers[j];
                System.out.print("(" +curr +"," +secondnum +")");
                numOfPairs++;
            }
            
            System.out.println();
        }
        System.out.println(numOfPairs);

    }
    public static void main(String [] args){
        int numbers[] = {2,4,6,8,10};
        pairsInAnArrayy(numbers);
    }
}
