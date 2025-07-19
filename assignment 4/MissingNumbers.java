import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MissingNumbers {
    public static ArrayList<Integer> getMissing(ArrayList<Integer> numbers) {
        ArrayList<Integer> nums = new ArrayList<>();
        if (numbers.isEmpty()) {
            return nums;
        }
        for (int i = numbers.get(0); i <= numbers.get(numbers.size() - 1); i++) {
            if (numbers.contains(i)) {
                continue;
            }
            nums.add(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (exit == false) {
            try {
                System.out.print("Enter the integer to add:");
                int inp = input.nextInt();
                if (numbers.isEmpty()) {
                    numbers.add(inp);
                } else {
                    boolean inserted = false;
                    for (int j = numbers.size() - 1; j >= 0; j--) {
                        if (numbers.get(j) <= inp) {
                            numbers.add(j + 1, inp);
                            inserted = true;
                            break;
                        }

                    }
                    if (!inserted) {
                        numbers.add(0, inp);

                    }

                }
                System.out.println("do u need to stop adding numbers enter Y ,else press any key");
                String ans = input.next();
                if (ans.equals("Y") || ans.equals("y")) {
                    exit = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("enter valid integer.");
                input.nextLine();
            }

        }
        System.out.println(getMissing(numbers));
    }
}
