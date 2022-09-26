import java.util.Scanner;

class Lab_Activity1 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String str = input.nextLine(), reverseStr = "";
                input.close();
                int strLength = str.length();

                // reversing string
                for (int i = (strLength - 1); i >= 0; --i) {
                        reverseStr = reverseStr + str.charAt(i);
                }

                // show if palindrome or not
                if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                        System.out.println(str + " is a Palindrome String.");
                } else {
                        System.out.println(str + " is not a Palindrome String.");
                }
        }
}