package questions;
// ARMSTRONG NUMBER 
  // Check whether the digit is an armstrong no. or not.
     // Armstrong number -- e.g 153 == 1*1*1+5*5*5+3*3*3 -- find number of digits then add each digit with the power of num of digit present in the number.
public class armstrong {
    public static void main(String[]args)
    {
        int num = 121;
        int ans = 0;
        int temp = num;

        while(num!=0)
        {
           int  rem=num%10;
            ans=ans+rem*rem*rem;
            num=num/10;

        }

        if(temp==ans)
        {
            System.out.println("it is an armstrong num");
        }
        else{
            System.out.println("it is not an armstrong num");
        }
    }
    
}
