import java.util.ArrayList;
import java.util.Scanner;

public class Lab_Activity3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT: ");
        String input = in.nextLine();
        in.close();
        System.out.println("\nOUTPUT: ");
        System.out.println(tokenizeInput(splitted_input(input)));
    }

    public static ArrayList<String> splitted_input(String input) {
        String[] specificString = input.split(" ");

        ArrayList<String> finalInput = new ArrayList<>();
        for (int i = 0; i < specificString.length; i++) {
            finalInput.add(specificString[i]);
        }

        return finalInput;
    }

    public static ArrayList<String> tokenizeInput(ArrayList<String> splittedInput) {

        ArrayList<String> tokens = new ArrayList<>();

        String numbers = "1234567890";
        String data_types = "int double String char boolean";
        String assignment_operator = "=";
        String bol = "true True TRUE false False FALSE";

        for (int i = 0; i < splittedInput.size(); i++) {
            // data type
            if (data_types.contains(splittedInput.get(i))) {
                tokens.add("<data type>");
            }

            // assignment operator
            else if (assignment_operator.contains(splittedInput.get(i))) {
                tokens.add("<assignment_operator>");
            }

            // value
            else if (numbers.contains(splittedInput.get(i))
                    || Character.toString(splittedInput.get(i).charAt(0)).equals("\"")
                    || bol.contains(splittedInput.get(i))) {
                tokens.add("<value>");
            }

            // delimiter
            else if (Character.toString(splittedInput.get(i).charAt(0)).equals(";")) {

                tokens.add("<delimiter>");
            } else {
                tokens.add("<identifier>");
            }
        }
        return tokens;
    }
}
