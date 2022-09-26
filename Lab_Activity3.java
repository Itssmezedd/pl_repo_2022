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
        boolean isIdentifier = true;
        for (int i = 0; i < splittedInput.size(); i++) {
            // data type
            if (splittedInput.get(i).equals("int") || splittedInput.get(i).equals("String")
                    || splittedInput.get(i).equals("double") || splittedInput.get(i).equals("char")
                    || splittedInput.get(i).equals("boolean")) {
                tokens.add("data type");
            }

            // identifier
            if (isIdentifier) {
                isIdentifier = false;
                tokens.add("<identifier>");
            }

            // assignment operator
            if (splittedInput.get(i).equals("=")) {
                tokens.add("<assignment_operator>");
            }

            // value
            if (splittedInput.get(i).contains("true")
                    || splittedInput.get(i).contains("false")
                    || Character.isDigit(splittedInput.get(i).charAt(0))
                    || Character.toString(splittedInput.get(i).charAt(0)).equals("\"")) {
                tokens.add("<value>");
            }

            // delimiter
            if (splittedInput.get(i).equals(";")) {

            if (splittedInput.get(i).contains(";")) {

                tokens.add("<delimiter>");
            }
        }
        return tokens;
    }
}
