import java.util.Scanner;

public class Lab_Activity5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Expression: ");
        String input = in.nextLine();
        in.close();
        System.out.println(result(input));

    }

    public static String result(String input) {
        String[] specific = input.split(" ");
        String result = "";
        for (int i = 0;;) {
            if (specific[i].equals("int")) {
                if (specific[2].equals("=") && specific[specific.length - 1].equals(";")) {
                    char[] chars = specific[3].toCharArray();
                    for (char c : chars) {
                        if (Character.isDigit(c)) {
                            result = "Semantically Correct!";
                        }
                    }
                    break;
                } else {
                    result = "Semantically Incorrect!";
                    break;
                }
            } else if (specific[i].equals("double")) {
                if (specific[2].equals("=") && specific[specific.length - 1].equals(";")) {
                    char[] chars = specific[3].toCharArray();
                    boolean num = false;
                    for (char c : chars) {
                        if (Character.isDigit(c)) {
                            num = true;
                        }
                    }
                    if (num == true && specific[3].contains(".")) {
                        result = "Semantically correct!";
                    }
                    break;
                } else {
                    result = "Semantically Incorrect!";
                    break;
                }
            } else if (specific[i].equals("String")) {
                if (specific[2].equals("=")
                        && Character.toString(specific[3].charAt(0)).equals("\"")
                        && Character.toString(
                                specific[specific.length - 2].charAt(specific[specific.length - 2].length() - 1))
                                .equals("\"")
                        && specific[specific.length - 1].equals(";")) {
                    result = "Semantically Correct!";
                    break;
                } else {
                    result = "Semantically Incorrect!";
                    break;
                }
            } else if (specific[i].equals("char")) {
                if (specific[2].equals("=")
                        && (Character.toString(specific[3].charAt(0)).equals("\'")
                                && Character.toString(specific[3].charAt(2)).equals("\'")
                                || specific[3].length() == 1)
                        && specific[specific.length - 1].equals(";")) {

                    result = "Semantically Correct!";
                    break;
                } else {
                    result = "Semantically Incorrect!";
                    break;
                }
            } else if (specific[i].equals("boolean")) {
                String bol = "true True TRUE false False FALSE";
                if (specific[2].equals("=") && bol.contains(specific[3])
                        && specific[specific.length - 1].equals(";")) {
                    result = "Semantically Correct!";
                    break;
                } else {
                    result = "Semantically Incorrect!";
                    break;
                }
            } else {
                result = "Semantically Incorrect!";
                break;
            }
        }
        return result;
    }
}