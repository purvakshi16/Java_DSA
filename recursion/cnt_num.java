package Recursion;

public class cnt_num {

    // using loop
    public static int count(int n)
    {
        int cnt =0;
        if(n==0)
        {
            return 1;
        }
        while(n!=0)
        {
            n=n/10;
            cnt++;
            
        }
        return cnt;

    }

    // using recursion
    public static int count_r(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }

        int cnt = 1+count_r(n/10);
        
        return cnt;
    }

    public static void main(String args[])
    {
        int ans = count(123456789);
        System.out.println(ans);

        int ans_r= count_r(123456789);
        System.out.println(ans_r);
    }
    
}
