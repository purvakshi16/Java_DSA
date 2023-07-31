package DSA_ARRAY;

public class second_max 
{
    public static int sec_max(int arr[],int n)
    {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

       // max = arr[0];

        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                sec_max = max;
                max = arr[i];
            }
            else
            {
                if(arr[i]>sec_max)
                {
                    sec_max=arr[i];
                }

            }
            // if(max>sec_max)
            // {
            //     sec_max = max;
            // }
            
        }
        return sec_max;

    }

    public static void main(String args[])
    {
        int a[] = {2,4,7,5,6};
        // {2,4,7,5,6};
    
        int n=a.length;

        int ans = sec_max(a,n);
        System.out.println(ans);

       // int ans_1 = max_2(a,n);
        //System.out.println(ans_1);



    }

    
}
