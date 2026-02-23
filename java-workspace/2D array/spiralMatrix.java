public class spiralMatrix {
    public static void main(String [] args){
        int [][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows -1;
        int left = 0;
        int right = cols -1;

        while(top <= bottom && left <= right){
            for(int col = left; col<=right; col++){
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            for(int row = top; row <= bottom; row++){
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            if(top <= bottom){
                for(int col = right; col >= left ; col--){
                    System.out.print(matrix[bottom][col]+ " ");
                }
                bottom--;
            }

            if(left <= right){
                for(int row=bottom; row>=top; row--){
                    System.out.print(matrix[row][left]+" ");
                }
                left++;
            }
        }
    }

}
