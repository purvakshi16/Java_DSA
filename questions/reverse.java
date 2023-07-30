// Reversing a number.

package questions;
import java.util.Scanner;
public class reverse {
    public static void main(String[]args)
    {
        System.out.println("Enter a number:");

        try (Scanner abc = new Scanner(System.in)) {
            int num = abc.nextInt();
              int num2 = 0;

             while(num!=0)
             {
                int temp= num%10;
                num2 = (num2*10)+temp;
                num=num/10;
             }

             System.out.println("Reversed number:-\n"+num2);
        }
          }
    
}
