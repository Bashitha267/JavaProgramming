import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        StackADT list = new StackADT(25);
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = inp.nextInt();
        while (num != 0) {
            int rem = num % 2;
            list.push(rem);
            num = num / 2;

        }
        list.display();
    }
}