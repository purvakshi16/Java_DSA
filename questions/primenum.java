package questions;
// check whether a number is prime or not.
   // prime number -- when a num is divisible only by itself , 1 in not considered prime.
public class primenum {
    public static void main(String[]args)
    {
        int num = 397;
        boolean prime = true;

        for(int i = 2;i<num;i++)
        {
            if(num%i==0)
            {
               // System.out.println("not prime");
               prime = false;
            }
        }

            if(prime){
                System.out.println(num +" is prime");
            }
            else {
                System.out.println("not prime  ");
            }
        }
    
}
