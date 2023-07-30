// Check whether a number id even or odd.

package questions;
import java.util.Scanner;

public class even
{
    public static void main(String[]args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:- ");
            int n= sc.nextInt();
            if((n/2)*2==n)
            {
                System.out.println("Number is even");
                
            }
            else
            {
                System.out.println("number is odd");
                
            }
        }
    }
}
