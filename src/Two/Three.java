package Two;

public class Three {
    public static void main(String[] args) {
        double [][] matrix = new double[][]{{7, 8, 9}, {4, 5, 11},{25, 2, 14}};
        System.out.println(findDeterminant(matrix));
    }

    private static double findDeterminant(double[][] matrix) {
        int determinant = 0;
        if (matrix.length == 1)
            return matrix[0][0];
        for(int i = 0; i < matrix.length; ++i){
            determinant += Math.pow(-1,i)*matrix[i][0] * findDeterminant(buildMatrix(matrix, i,0));
        }
        return determinant;
    }
    private static double[][] buildMatrix(double[][] matrix, int row, int column){
        double[][] resultMatrix = new double[matrix.length-1][matrix.length-1];
        int di =0, dj = 0;
        for(int i = 0; i < matrix.length-1; ++i){
            if(i == row) di = 1;
            dj = 0;
            for (int j = 0; j < matrix.length-1; ++j){
                if(j == column) dj = 1;
                resultMatrix[i][j] = matrix[i+di][j+dj];
            }
        }
        return resultMatrix;
    }
}
