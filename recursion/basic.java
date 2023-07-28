package recursion;

public class basic {
    
    // for printing n to 1
    public static void fun1(int n)
    {
        if (n==0)
        {
            return ;
        }

        System.out.println(n);
        fun1(n-1);
    }
    
    // for printing 1 to n
    public static void fun2(int n)
    {
        if (n==0)
        {
            return ;
        }

        fun2(n-1);
        System.out.println(n);

    }

    //print n to 1 then 2 to n 
    // 5 4 3 2 1 2 3 4 5
    public static void fun3(int n)
    {
        if (n==1)
        {
            System.out.println(n);
            return ;
        }

        System.out.println(n);
        fun3(n-1);
        System.out.println(n);


    }

    // odd even mixed
    public static void fun4(int n)
    {
    
        if(n==0)
        {
            return;
        }
        if(n%2 != 0)
        {
            System.out.println(n);

        }

        fun4(n-1);
         if(n%2==0)
        {
            System.out.println(n);

        }


    }

    public static void main(String[] Args)
    {
        //fun1(5);
        //fun2(5);
        //fun3(5);
        fun4(9);
    }
    
}
