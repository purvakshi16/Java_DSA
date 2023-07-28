package Recursion;
// count number of zeros in an digits
public class cnt_0 {
    
    // using loop
    public static int count_0(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int cnt =0;
        while(n!=0)
        {
            int d = n%10;
            n = n/10;
            if(d==0)
            {
                cnt++;
            }


        }
        return cnt;
    }

    //using recursion
    public static int count_0_r(int n)
    {
        int cnt=0;
        if(n==0)
        {
            return 1;
        }
        int num = 
        
        return cnt;
    }
    

    public static void main(String [] a)
    {
        int ans = count_0(100100100);
        System.out.println(ans); 
    }
    
}
