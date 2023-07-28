package Recursion;

public class search_ele
 {
    
        static int search_from_last(int a[],int n,int val)
        {
            int s = a.length;
            int ans =0;

            if(a[n]==val)
            {
                return s-n;
            }

            ans = search_from_last(a,n+1,val);
            return a.length-ans;
        }
        
        public static void main (String args[])
        {
            int arr[]={20,90,1,90,6};

            int ans = search_from_last(arr,0,90);
            System.out.println(ans);



        }
    
}
