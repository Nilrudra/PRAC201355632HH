//  Task
//Given an integer, , perform the following conditional actions:

//If n is odd, print Weird
//If n is even and in the inclusive range of 2 to 5 , print Not Weird
//If n is even and in the inclusive range of 6 to 20 , print Weird
//If n  is even and greater than 20 , print Not Weird
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
      System.out.println ("Enter the number : ");
    int N = scan.nextInt ();

    if (N % 2 == 0 && N >= 5 && N <= 20)
      {
	System.out.println (" EVEN weird");
      }
    else if (N % 2 == 0 && N >= 20)
      {
	System.out.println (" even not weird ");
      }
    else if (N % 2 != 0)
      {
	System.out.println (" odd weird ");
      }

    else if (N % 2 == 0 && N >= 1 && N <= 5)
      {
	System.out.println (" EVen not weird ");

      }
  }
}
