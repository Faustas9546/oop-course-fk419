public class Main {
    public static float[][] createMatrix(int n) {
        var matrix = new float[n][n];
        for(int i = 0; i<n; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }
}
