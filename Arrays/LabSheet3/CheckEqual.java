public class CheckEqual {
    public static boolean checkEqual(ArrayADT arr1, ArrayADT arr2) {
        if (arr1.getSize() != arr2.getSize()) {
            return false;
        }
        for (int i = 0; i < arr1.getSize(); i++) {
            if (arr1.get(i) != arr2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayADT arr1 = new ArrayADT(8);
        ArrayADT arr2 = new ArrayADT(8);
        arr1.insert(0, 10);
        arr1.insert(1, 20);
        arr1.insert(2, 30);
        arr1.insert(3, 40);
        arr1.insert(4, 50);
        arr1.insert(5, 60);
        arr1.insert(6, 70);
        arr1.insert(7, 80);

        arr2.insert(0, 10);
        arr2.insert(1, 20);
        arr2.insert(2, 30);
        arr2.insert(3, 40);
        arr2.insert(4, 50);
        arr2.insert(5, 60);
        arr2.insert(6, 70);
        arr2.insert(7, 80);
        System.out.println();
        System.out.println(checkEqual(arr1, arr2));
        System.out.println();

        ArrayADT arr3 = new ArrayADT(8);
        ArrayADT arr4 = new ArrayADT(8);

        arr3.insert(0, 10);
        arr3.insert(1, 20);
        arr3.insert(2, 30);
        arr3.insert(3, 40);
        arr3.insert(4, 50);
        arr3.insert(5, 60);
        arr3.insert(6, 70);
        arr3.insert(7, 80);

        arr4.insert(0, 10);
        arr4.insert(1, 20);
        arr4.insert(2, 30);
        arr4.insert(3, 90);
        arr4.insert(4, 50);
        arr4.insert(5, 45);
        arr4.insert(6, 70);
        arr4.insert(7, 80);
        System.out.println();
        System.out.println(checkEqual(arr3, arr4));

    }
}
