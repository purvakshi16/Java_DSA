package Recursion;

public class prime {
    // using loop
    public static void check(int n)
    {
        int i=2;
        boolean flag = false;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                flag = true;
                break;
            }
            else
            {
                i++;
            }

        }

            if(flag)
            {
                System.out.println("not prime");
            }
            else
            {
                System.out.println("prime");
            }
                
    }

    // using recursion
    public static void check_r(int n,int i)
    {
        if(n==2 || n==i)
        {
            System.out.println("prime");
        }
        
        if(n%i == 0 || n<= 1)
        {
            System.out.println("not prime");
        }
        
        check_r(n,i+1);



    }

    // GENERATE ALL THE PRIME NUMBERS IN THE GIVEN RANGE
    public static void generate(int range)
    {
        int num =1;
        int i=2;
        while(num>=range && i>=num)
        {
            

        }
    }

    public static void main(String [] a)
    {
        check(29);

       check_r(29,0);

    }
    
}
