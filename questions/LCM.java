// Finding the LCM of two numbers 
// USing - LCM = (a+b)/Hcf formula.

package questions;
import java.util.Scanner;

public class LCM {
    public static void main(String[]args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:- ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            int rem;
            int small;
            int bigger;

            if(x>y)
            {
                 small = y;
                 bigger = x;
            }
            else
            {
                 small = x;
                 bigger = y;
            }

            while(small != 0)
            {
                rem=bigger%small;
                bigger=small;
                small=rem;
            }

            int hcf = bigger;

            int lcm;
            lcm=(x*y)/hcf;
            System.out.println("least common multiple:- "+lcm);
        }



    }   
}
