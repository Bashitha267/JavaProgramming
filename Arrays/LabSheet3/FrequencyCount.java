public class FrequencyCount {
    public static void getCount(ArrayADT arr) {
        boolean visited[] = new boolean[arr.getSize()];

        for (int i = 0; i < arr.getSize(); i++) {
            int count = 1;
            if (visited[i] == true)
                continue;
            for (int j = i + 1; j < arr.getSize(); j++) {

                if (arr.get(i) == arr.get(j)) {
                    count = count + 1;
                    visited[j] = true;
                }
            }
            System.out.println(arr.get(i) + ":" + count);
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
        getCount(arr);
    }
}
