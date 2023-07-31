package arrays;

public class reverse 
{

    public static void rev(int arr[],int li , int ri)
    {
        

        while(li<ri)
        {
             int temp = arr[li];
             arr[li]=arr[ri];
             arr[ri]=temp;

             li++;
             ri--;
        }

    }

    public static void main(String []args)
    {
       int arr[]={1,2,3,4,5,6,7};

        rev(arr,0,arr.length-1);

       for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }

    
}
