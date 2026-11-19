public class Transpose {
    public static void transposeMatrix(float[][] matrix) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = i+1; j<matrix[i].length; j++) {
                float temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static float[][] createMatrix(int n) {
        var matrix = new float[n][n];
        for(int i = 0; i<n; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }


    public static void main(String[] args) {
        var matrix = createMatrix(5);
        matrix[0][1] = 3;
        transposeMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
