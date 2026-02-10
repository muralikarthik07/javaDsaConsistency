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
        for(int i=heigth.length -2; i>=0; i--){
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

//Leet code
class Solution {

    public int trap(int[] height) {
        int n = height.length;

        int leftMaxBoundary[] = new int[n];
        int rightMaxBoundary[] = new int[n];

        // left max boundary
        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i - 1]);
        }

        // right max boundary
        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
        }

        // trapped water calculation
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}