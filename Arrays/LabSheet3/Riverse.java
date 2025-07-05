public class Riverse {
    public static int[] riverse(ArrayADT arr) {
        int[] riv = new int[arr.getSize()];
        for (int i = 0; i < arr.getSize(); i++) {
            riv[i] = arr.get(arr.getSize() - i - 1);
        }
        return riv;
    }

    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(5);
        arr.insert(0, 40);
        arr.insert(1, 24);
        arr.insert(2, 48);
        arr.insert(3, 57);
        arr.insert(4, 12);
        int[] riverse = new int[arr.getSize()];
        riverse = riverse(arr);
        for (int i = 0; i < riverse.length; i++) {
            System.out.print(riverse[i]);
            if (i < riverse.length - 1) {
                System.out.print(",");
            }
        }
    }
}
