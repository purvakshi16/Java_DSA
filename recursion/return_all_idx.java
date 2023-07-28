package Recursion;

import java.util.ArrayList;

public class return_all_idx 
{
    public static ArrayList<Integer> idx_return(int a[],int val)
    {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=1;i<a.length;i++)
        {

            if(i==a.length+1)
        {
            return al;
        }

            if(a[i]==val)
        {
            al.add(i);
        }
        }
        return al;
    }

    // using recursion
    public static ArrayList<Integer> idx_return_r(int a[],int val,int i)
    {
        ArrayList<Integer> al = new ArrayList<>();

            if(i==a.length)
        {
            return al;
        }

        if(a[i]==val)
        {
            al.add(i);
        }

        idx_return_r(a,val,i+1);

        

        return al;

        

    }

    public static void main(String args[])
    {
        int arr[]={20,5,6,0,5,9,5};

        ArrayList<Integer> ans = idx_return(arr,5);
        for(int val :ans)
        {
            System.out.println(val);
        }

        ArrayList<Integer> ans_r = idx_return(arr,5);
        for(int val :ans)
        {
            System.out.println(val);
        }

        


    }
    
}
