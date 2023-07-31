package arrays;

public class arr_recursion {

    public static void display(int a[],int i)
    {
        if(i==a.length)
        {
            return;
        }
        System.out.println(a[i]);
        display(a,i+1);
    }

    public static void display_reverse(int a[],int i)
    {
        if(i==a.length)
        {
            return;
        }
        display(a,i+1);
        System.out.println(a[i]);
    }



    // first occurance
    public static int occur(int a[],int i,int num)
    {
        int idx=-1; 
        if(i==a.length)
        {
            return idx;
        }

        if(a[i]!=num)
        {
            idx=occur(a,i+1,num);

        }
        else
        {
            idx =i;
        }

         return idx;

           

    }

    // last occurance
    public static int occur_last(int a[],int j,int num)
    {
        int idx=-1; 
        if(j>a.length)
        {
            return idx;
        }

        if(a[j]!=num)
        {
            idx=occur(a,j-1,num);

        }
        else
        {
            idx =j;
        }

         return idx;

    }

    // find all occurance
    public static int[] occur_all(int a[],int i,int num,int freq)
    {
        if(i==a.length)
        {
            int res[]=new int[freq];

            return res;
        }

        if(a[i]==num)
        {
            int res[]= occur_all(a,i+1,num,freq+1);
            res[freq]=i;
            return res;
        }
        else{
            int res[] = occur_all(a,i+1,num,freq);
            return res;
        }
        

    }

   // find sum of an array
    public static int sum_of_all(int a[],int i)
    {
        if(i==a.length)
        {
            return 0;
        }

        int ans = a[i]+sum_of_all(a,i+1);
        return ans;
    }

    // find max of an array
    public static int max(int a[])
    {
        int max_val = Integer.MAX_VALUE;
        int n = a.length;

        for(int i=0;i<n;i++)
        {
            if(a[0]>max_val)
            {
                max_val = a[0];
            }

        }
        return 0;
    }


    public static void main(String [] args)
    {
        int a[]={1,2,3,4,5,4,4,6};

        //display(a,0);

      // int ans = occur(a,0,4);
      // System.out.println(ans);

      // int j = a.length-1 ;
      // int last_ans = occur_last(a,j,4);
      // System.out.println(last_ans);


      // int ans_all[] = occur_all(a,0,4,0);
       // for(int val:ans_all)
      // {
      //  System.out.println(val);
      // }

     int sum_ans = sum_of_all(a,0);
       System.out.println(sum_ans);









        
        
    }
    
}
