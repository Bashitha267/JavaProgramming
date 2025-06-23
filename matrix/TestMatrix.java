public class TestMatrix {
    public static void main(String[] args) {
        // Matrix M1 = new Matrix(1, 2);
        // Matrix M2 = new Matrix(1, 2);
        Matrix M1 = new Matrix(
                new int[][] {
                        { 1, 2, 3 }, { 4, 5, 6 }
                }

        );
        Matrix M2 = new Matrix(
                new int[][] {
                        { 1, 2, 3 }, { 4, 5, 6 }
                }

        );
        int[][] sum = M1.AddMatrix(M2);
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }

}
