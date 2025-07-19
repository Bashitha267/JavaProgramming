public class InsertionSort {
    public static void sortArray(ArrayADT arr) {
        for (int i = 1; i < arr.getSize(); i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }

            arr.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(10);

        arr.insert(0, 50);
        arr.insert(1, 20);
        arr.insert(2, 40);
        arr.insert(3, 10);
        arr.insert(4, 80);
        arr.insert(5, 60);
        arr.insert(6, 30);
        arr.insert(7, 70);

        sortArray(arr);

        System.out.println("Sorted Array");
        arr.traverse();
    }
}
