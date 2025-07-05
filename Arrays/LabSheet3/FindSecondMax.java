public class FindSecondMax {
    public static int getSecondMax(ArrayADT arr) {

        for (int i = 0; i < arr.getSize() - 1; i++) {
            for (int j = 0; j < arr.getSize() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {

                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr.get(arr.getSize() - 2);

    }

    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(5);
        arr.insert(0, 40);
        arr.insert(1, 24);
        arr.insert(2, 48);
        arr.insert(3, 57);
        arr.insert(4, 12);
        System.out.println("Second max element is:" + getSecondMax(arr));
    }
}
