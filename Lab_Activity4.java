import java.util.Scanner;

public class Lab_Activity4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Tokens: ");
        String input = in.nextLine();
        in.close();
        System.out.println(checker(input));
    }

    public static String checker(String input) {
        if (input.equals("<data_type> <identifier> <assignment_operator> <value> <delimiter>")) {
            return "Syntax is Correct!";
        } else {
            return "Syntax is Error!";
        }
    }

}