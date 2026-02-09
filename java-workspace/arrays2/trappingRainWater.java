package arrays2;

public class trappingRainWater {

    public static int trappedRainWater(int heigth[]){
        //calculate the left max
        int maxLeftBoundary[] = new int[heigth.length];
        maxLeftBoundary[0] = heigth[0];
        for(int i = 1; i<heigth.length; i++){
            maxLeftBoundary[i]= Math.max(heigth[i], maxLeftBoundary[i-1]);
        }
        //calculate the rigth max
        int maxRigthBoundary[] = new int[heigth.length];
        maxRigthBoundary[heigth.length - 1] = heigth[heigth.length -1];
        for(int i=heigth.length -2;i>=0;i--){
            maxRigthBoundary[i] = Math.max(heigth[i], maxRigthBoundary[i+1]);
        }
        //calculate the minimum of both (water level)
        int TrappedWater = 0;
        for(int i=0; i<heigth.length; i++){
            int waterLevel = Math.min(maxLeftBoundary[i],maxRigthBoundary[i]);

            TrappedWater += waterLevel - heigth[i];
        }
        //calculate trappedWater = waterLevel - heigth
        return TrappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}
