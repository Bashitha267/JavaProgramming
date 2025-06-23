public class Matrix {
    private int rows;
    private int cols;
    private int[][] matrix;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void setElements(int i, int j, int value) {
        matrix[i][j] = value;
    }
}
