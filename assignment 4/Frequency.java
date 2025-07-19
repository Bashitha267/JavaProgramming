import java.util.ArrayList;

public class Frequency {
    public static void frequencyCount(ArrayList<String> str) {
        ArrayList<String> arr1 = new ArrayList<>();
        if (str.isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < str.size(); i++) {
            int count = 1;
            if (arr1.contains(str.get(i))) {
                continue;
            }
            for (int j = i + 1; j < str.size(); j++) {
                if (str.get(i).equals(str.get(j))) {
                    count = count + 1;
                }
            }
            System.out.println(str.get(i) + ":" + count);
            arr1.add(str.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Banana");
        str.add("Apple");
        str.add("Orange");
        str.add("Banana");
        str.add("Apple");
        str.add("Apple");
        str.add("Grape");
        str.add("Grape");
        str.add("Grape");
        str.add("Cherry");
        frequencyCount(str);
    }
}
