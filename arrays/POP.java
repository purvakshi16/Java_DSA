package arrays;
import java.util.Scanner;


public class POP {
    
    public static void main(String[] args) 
    {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                arr[i] = scn.nextInt();
            }

            int rsum=0;
            int lsum=0;
            int ans=-1;
            
            for(int i=0;i<arr.length;i++)
            {
                rsum=rsum+arr[i];
            }
            
            for(int idx=0;idx<arr.length;idx++)
            {
                rsum=rsum-arr[idx];
                
                if(rsum==lsum)
                {
                    ans=idx;
                    break;
                }
                
                lsum=lsum+arr[idx];
            }
            System.out.println("POINT OF PARITY is " + arr[ans] + " at index:-"+ ans);
        }
        
        

    }
}