import java.util.Scanner;

public class Lab_Activity2 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Input: ");
      String input = in.nextLine();
      in.close();
      String state = "q0";

      for (int x = 0; x < input.length(); x++) {
         char temp = input.charAt(x);

         switch (state) {
            case "q0":
               if (temp == '0')
                  state = "q1";
               break;
            case "q1":
               if (temp == '1')
                  state = "q2";
               break;
            case "q2":
               if (temp == '0')
                  state = "q1";
               else if (temp == '1')
                  state = "q0";
               break;
         }
      }
      if (state.equals("q2")) {
         System.out.println("\nString accepted");
      } else {
         System.out.println("\nString not accepted");
      }

   }

}