package arrays;
import java.util.Scanner;
public class printsubarrays {
    public static void main(String []args)
    {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]= s.nextInt();
            }

            int sp=0;
            int ep=0;

            for(int i=0;i<n-1;i++)
            {

                System.out.print( arr[ep] );

                if(ep>=n-1)
                {
                    sp++;
                    ep=sp;
                }
                ep++;
                i=sp;
            }
        }
    }
}
