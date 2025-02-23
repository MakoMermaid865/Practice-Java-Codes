//Below is a nested loop example that graphically depicts an integer's magnitude by using asterisks, creating a "histogram." The inner loop is a for loop that handles the printing of the asterisks.
//The outer loop is a while loop that handles executing until a negative number is entered.
import java.util.Scanner;

public class IntHistogram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numAsterisk;  // Number of asterisks to print
      int i;            // Loop counter

      numAsterisk = 0;

      while (numAsterisk >= 0) {
         System.out.print("Enter an integer (negative to quit): ");
         numAsterisk = scnr.nextInt();

         if (numAsterisk >= 0) {
            System.out.println("Depicted graphically:");
            for (i = 1; i <= numAsterisk; ++i) {
               System.out.print("*");
            }
            System.out.println("\n");
         }
      }

      System.out.println("Goodbye.");
   }
}
