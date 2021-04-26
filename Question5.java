import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("How many inputs would you like to call? (enter a number) -  ");
    int x = in.nextInt();
    List<Interger> intList = new ArrayList<Interger>();
    for (int i = 0; i < x; i++){
      System.out.print("");
      int number = in.nextInt();
      intList.add(number);
    };

    for (int i = 0; i < intList.size(); i++){
      for (int k = i+1; k < intList.size(); k++ ){
        if (intList.get(i).equals(intList.get(k))){
          x--;
        }
      }
    }
    System.out.println(x);
  }
}
