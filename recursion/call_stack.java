package Recursion;

public class call_stack {
    void fun1()
    {
        System.out.println("function 1");
    }

    void fun2()
    {
        fun1();
        System.out.println("function 2");
    }

    void fun3()
    {
        fun2();
        System.out.println("function 3");
    }

    void fun4()
    {
        fun3();
        System.out.println("function 4");
    }

    public static void main(String[] args)
    {
        call_stack obj = new call_stack();

        obj.fun4();

    }
    
}
