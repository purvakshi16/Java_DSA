package Recursion;

public class fibonacci {

    static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }

        int result = fib(n-1)+fib(n-2);

        return result;
    }

    public static void main(String a[])
    {
        int ans = fib(10);

        System.out.println(ans);
    }
    
}
