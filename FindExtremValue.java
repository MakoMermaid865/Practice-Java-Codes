/**
Write a for loop that iterates nine times to find the minimum value in a list of nine integer values. Within the loop:
Read an integer value from input into variable inputVal.
If the current iteration is the first iteration, reassign minVal with inputVal. No other values have been read yet, so the first value assigned to inputVal is the smallest integer value read by default.
Otherwise, if inputVal is less than minVal, reassign minVal with the value of inputVal.
*/
import java.util.Scanner;

public class MinValues {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputVal;
      int minVal = 0;
      int i;

      for (i = 0; i < 9; i++) {
         inputVal = scnr.nextInt();
         if (i == 0) {
            minVal = inputVal;
         } else if (inputVal < minVal) {
            minVal = inputVal;
         }
      }

      System.out.println(minVal);
   }
}
