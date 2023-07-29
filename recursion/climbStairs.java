package recursion;

import java.util.ArrayList;
import java.util.Scanner;

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

    // get reactive approch
    public static ArrayList<String> getways_r(int n)
    {
        if(n==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }

        if(n<0)
        {
            return new ArrayList<>();
        }

        ArrayList<String> way1 = getways_r(n-1);
        ArrayList<String> way2 = getways_r(n-2);
        ArrayList<String> way3 = getways_r(n-3);

        ArrayList<String> ways = new ArrayList<>();

        for(String s  : way1)
        {
            ways.add(s+"1");
        }
        for(String s  : way2)
        {
            ways.add(s+"2");
        }
        for(String s  : way3)
        {
            ways.add(s+"3");
        }

        return ways;
    }

    // print proactive approch
    public static void printways(int n , String wsf)
    {

    }

    //print reactive approch
    public static void printways_r(int n , String wsf)
    {
        if(n==0)
        {
            System.out.println(wsf);
            return;
        }
        if(n<0)
        {
            return;
        }

        printways_r(n-1, wsf+"1");
        printways_r(n-2, wsf+"2");
        printways_r(n-3, wsf+"3");
    
    }
    
    // reactive way
    public static int countways(int n)
    {
        int count=0;
        if(n==0)
        {
            //count++;
            return 1;
        }
        if(n<0)
        {
            return 0;
        }

        int one = countways(n-1);
        int two = countways(n-2);
        int three = countways(n-3);

        return (one+two+three);

    }

    // proactive way
    public static int countways_p(int n)
    {
        if(n==0)
        {
            return 1;
        }

        int way1 =0,way2=0, way3=0;

        if(n-1>=0)
        {   
            way1 = countways_p(n-1);
        }
        if(n-2>=0)
        {
            way2 = countways_p(n-2);
        }
        if(n-3>=0)
        {
            way3 = countways_p(n-3);
        }
        return way1+way2+way3;

    }

    public static int numOfWaysToClimbStairsWithVariableJump(int stNum , int moves[])
    {
        if(stNum==moves.length)
        {
            return 1;
        }
        if(stNum>moves.length || moves[stNum]==0 )
        {
            return 0;
        }
        int max_move = moves[stNum];
        int ways=0;
        for(int i=0;i<max_move;i++)
        {
            ways = ways+numOfWaysToClimbStairsWithVariableJump(stNum+1+i, moves);
        }
        return ways;
    }

    public static void numOfWaysToClimbStairsWithVariableJump_Helper(Scanner scn){
        int numOfStairs = scn.nextInt();

        int moves[] = new int[numOfStairs];

        for(int i = 0 ; i < numOfStairs ; i++){
            moves[i] = scn.nextInt();
        }
        /*
        Sample Input :
        10
        3 3 0 2 1 2 4 2 0 0
         */

        System.out.println(numOfWaysToClimbStairsWithVariableJump(0,moves));

    }

    // min effort 
    public static int minMovesToClimbStairs(int currStair,int moves[])
    {
        if(currStair==moves.length)
        {
            return 0;
        }
        if(currStair>moves.length || moves[currStair]==0 )
        {
            return Integer.MAX_VALUE;
        }
        int max_move = moves[currStair];
        int ways=0;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=max_move;i++)
        {
            ways = ways+minMovesToClimbStairs(currStair+1, moves);
            min = Math.min(ways,min);

        }


        return ways;
        
    }




    public static void main(String [] args )
    {
        int n = 4;

        // proactive way of getting ways
        // ArrayList<String> ans = new ArrayList<>();
        // ans = getways(n);
        // System.out.println(ans);

        // // reactive way of getting ways
        // ArrayList<String> ans_r = new ArrayList<>();
        // ans_r = getways(n);
        // System.out.println(ans_r);

        // //proactive way of printing ways

        // //reactive way of printing ways
        // printways_r(n , " ");


        // //reactive way of counting ways
        // int ans_c = countways(n);
        // System.out.println(ans_c);

        // // proactive ways of counting ways
        // int ans_p = countways(n);
        // System.out.println(ans_p);

        // Scanner sc = new Scanner(System.in);
        // numOfWaysToClimbStairsWithVariableJump_Helper(sc);

        // min effort 
        Scanner scn = new Scanner(System.in);

        int numOfStairs = scn.nextInt();
        int moves[] = new int[numOfStairs];
        for(int i = 0 ; i < numOfStairs ; i++){
            moves[i] = scn.nextInt();
        }

        System.out.println(minMovesToClimbStairs(0,moves));

        int Mini_moves = minMovesToClimbStairs(numOfStairs, moves);
        System.out.println(Mini_moves);


    }
    
}
