public class Matrix {
    private int rows;
    private int cols;
    private int[][] matrix;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    Matrix(int m[][]) {
        matrix = m;

    }

    public void setElements(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    public int[][] AddMatrix(Matrix M2) {
        int[][] sum = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum[i][j] = matrix[i][j] + M2.getElement(i, j);
            }
        }
        return sum;
    }
}