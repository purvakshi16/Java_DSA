package Recursion;

public class sum_of_digit {

   // sum using loop
    public static int sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int num = n%10;
            sum = sum+num;
            n= n/10;

        }
        return sum;

    }

    //sum using recursion
    public static int sum_r(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum = sum+ n%10;

        n = n/10;
        return sum_r(n , sum);

    }
    public static void main(String args[])
    {
        int ans = sum(12345);
        System.out.println(ans);

        int ans_r = sum_r(12345,0);
        System.out.println(ans);
    }
    
}
