package recursion;
import java.util.*;
public class maze 
{
    static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc)
    {
        if(sr>dr || sc>dc)
        {
            return new ArrayList<>();
        }

        if(sc==dc && sr==dr)
        {
            ArrayList<String> n = new ArrayList<>();
            n.add(" ");
            return n;
        }

        ArrayList<String> h = getMazePath(sr, sc+1, dr, dc);

        ArrayList<String> v = getMazePath(sr+1, sc, dr, dc);

        ArrayList<String> path = new ArrayList<>();
        for(String s : h)
        {
            path.add("h"+s);
        }
        for(String s : v)
        {
            path.add("v"+s);
        }

        return path;
        // try for HW
    }

    static void printMazePath(int sr,int sc,int dr,int dc,String psf)
    {
        
        if(sr>dr || sc>dc)
        {
            return;
        }
        if(sc==dc && sr==dr)
        {
            System.out.println(psf);
        }

        printMazePath(sr+1, sc, dr, dc, psf+'V');

        printMazePath(sr, sc+1, dr, dc, psf+'H');


    }
    public static void main(String args[])
    {
        ArrayList<String> ans = getMazePath(0, 0, 2, 2);
        System.out.println(ans);

        //printMazePath(0, 0, 2, 2, " ");


    }
    
}
