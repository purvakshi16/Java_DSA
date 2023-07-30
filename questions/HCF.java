// Find the HCF of two numbers.

package questions;

public class HCF {
    public static void main(String[]args)
    {
        int x=40;
        int y=48;
        int rem;

        while(x != 0){
           rem = y%x;
           y=x; 
           x=rem;
        }
        System.out.println("greatest comman divisor is :- "+ y);

    }

    
}
