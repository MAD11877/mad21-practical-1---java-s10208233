import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter triangle base");
    int row = in.nextInt();
    for (int x = 1; x<row+1; x++){
      for (int y = 1; y<x+1; y++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
