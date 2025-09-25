import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrone(StackADTAny<Character> strList, String word) {
        word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                strList.push(word.charAt(i));

            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                if (word.charAt(i) != strList.pop()) {
                    return false;

                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the word to check: ");
        String word = inp.nextLine();

        StackADTAny<Character> strList = new StackADTAny<>();
        System.out.println("This is a valid palindrome:" + checkPalindrone(strList, word));

    }
}
