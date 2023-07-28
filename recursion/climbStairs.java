package recursion;

import java.util.ArrayList;

public class climbStairs 
{
    // get proactive approch
    public static ArrayList<String> getways(int n)
    {
        if(n==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }

        ArrayList<String> way1 = null,way2= null , way3 = null;

        if(n-1>=0)
        {   
            way1 = getways(n-1);
        }
        if(n-2>=0)
        {
            way2 = getways(n-2);
        }
        if(n-3>=0)
        {
            way3 = getways(n-3);
        }

        ArrayList<String> ways = new ArrayList<>();
        
        if(way1 != null)
        {
            for(String w : way1)
            {
                ways.add(w+"1");
            }

        }
        if(way2 != null)
        {
            for(String w : way2)
            {
                ways.add(w+"2");
            }
        }
        if(way3 !=null)
        {
            for(String w : way3)
            {
                ways.add(w+"3");
            }
        }

        return ways;
    }

    // print proactive approch
    public static void printways(int n , String wsf)
    {



    }

    public static void main(String [] args )
    {
        int n = 4;
        ArrayList<String> ans = new ArrayList<>();
        ans = getways(n);
        System.out.println(ans);

    }
    
}
