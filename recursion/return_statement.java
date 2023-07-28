package Recursion;

public class return_statement {

    static void fun1(int n)
    {
        // base case
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        fun1(n-1);
    }

    static void fun2(int n)
    {
        // base case
        if(n==0)
        {
            return;
        }

        //System.out.println(n);
        fun2(n-1);
        System.out.println(n);
    }

    public static void main(String []a)
    {
        return_statement obj = new return_statement();

        obj.fun1(5);
        System.out.println("\n");
        obj.fun2(5);

    }


    
}
