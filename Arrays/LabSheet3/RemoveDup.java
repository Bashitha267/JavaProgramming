public class RemoveDup {
    public static void remove(ArrayADT arr) {
        boolean visited[] = new boolean[arr.getSize()];

        for (int i = 0; i < arr.getSize(); i++) {
            int count = 1;
            if (visited[i] == true) {
                arr.delete(i);
            }

            for (int j = i + 1; j < arr.getSize(); j++) {

                if (arr.get(i) == arr.get(j)) {

                    visited[j] = true;
                }
            }
            System.out.println(arr.get(i) + ":" + count);
        }
        for (int i = 0; i < visited.length; i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(8);
        arr.insert(0, 2);
        arr.insert(2, 4);
        arr.insert(1, 1);
        arr.insert(3, 2);
        arr.insert(4, 2);
        arr.insert(5, 8);
        arr.insert(6, 8);
        arr.insert(7, 15);
        remove(arr);
    }
}
