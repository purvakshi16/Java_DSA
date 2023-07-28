package Recursion;

// find if array is sorted or not

public class arr_check {

    public static void is_sorted(int a[])
    {
        int i=0;
        if(a.length-1==0 || a.length==i)
        {
            System.out.println("array is sorted");

        }
        while(i!=a.length-1)
        {
            if(a[i]>a[i+1])
            {
                System.out.println("array is not sorted"); 
                break;
            }
            else{
                i++;
            }
        }

    }

    public static boolean is_sorted_r(int a[],int i)
    {
        if(a.length-1==0 || a.length-1==i)
        {
            System.out.println("array is sorted");
            return true;
        }

        if(a[i]>a[i+1])
        {
            System.out.println("array is not sorted");
            return false;
        }

        return is_sorted_r(a,i+1);
        


    }



    public static void main(String a[])
    {


        int arr[]={ 1,2,5,4,5};

        is_sorted(arr);
        //is_sorted_r(arr,0);
    }


    
}
