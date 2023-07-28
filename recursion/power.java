package Recursion;

public class power {

    public static int pwr(int n,int p)
    {
        // using loop
        if(p==0)
        {
            return 1;
        }

        int ans = 1;
        while(p!=0)
        {
             ans = ans*n;
             p--;

        }

        return ans;
    }

    // using recursin
    public static int pwr_r(int n , int p)
    {
       // int ans=1;

        if(p==0)
        {
            return 1;
        }

         int ans = n*pwr(n,p-1);
        return ans;
    }
    public static void main(String a[])
    {
        int ans = pwr_r(2,3);
        System.out.println(ans);

    }
    
}
