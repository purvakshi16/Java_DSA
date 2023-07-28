package recursion;
public class pwr {
    public static int fun5(int n , int p)
    {
        int ans;
        if(p==0)
        {
            return 1;
        }
        
        ans = n*(fun5(n,p-1));
        return ans;

    }

    // better way
        public static int fun6(int n , int p)
        {
            int ans;
            if(p==0)
            {
                return 1;
            }

            if(p%2!=0)
            {
                ans = n*(fun5(n,p/2)*fun5(n,p/2));

            }
            else
            {
                ans = (fun5(n,p/2)*fun5(n,p/2));

            }

            
            return ans;
    
        }

        // more optimized 
        // no repetation of calling function.
        public static int fun7(int n , int p)
        {
            int ans;
            int half_val = fun5(n,p/2);
            int val = half_val*half_val;

            if(p==0)
            {
                return 1;
            }

            if(p%2!=0)
            {
                ans = n*val;

            }
            else
            {
                ans = val;

            }

            
            return ans;
    
        }
    
    
public static void main(String [] args)
{
    int ans = fun6(2,4);
    System.out.println(ans);

}
    
}
