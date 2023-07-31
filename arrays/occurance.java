package arrays;
public class occurance {

   
    public static int FirstOccurance(int arr[],int x){
        int si = 0 , ei = arr.length-1;
        int ans = -1;
        while(si <= ei){
            int mid = (si + ei) / 2;

            if(x < arr[mid]){
                ei = mid - 1;
            }else if(arr[mid] < x){
                si = mid + 1;
            }else{
                ans = mid;
                ei = mid - 1;
            }
        }
        return ans;
    }
    public static int LastOccurance(int arr[],int x){
        int si = 0 , ei = arr.length-1;
        int ans = -1;
        while(si <= ei){
            int mid = (si + ei) / 2;

            if(x < arr[mid]){
                ei = mid - 1;
            }else if(arr[mid] < x){
                si = mid + 1;
            }else{
                ans = mid;
                si = mid + 1;
            }
        }
        return ans;
    }

    static int count_num(int[] arr, int n, int x) {
        // code here
        int fo = FirstOccurance(arr, x);
        int lo = LastOccurance(arr,x );

        int res = lo - fo + 1;
        System.out.println(fo);
        System.out.println(lo);

        return res;
        
    }

    public static void main(String []args)
    {
        int a[] ={1,1,2,2,2,2,3};
        int n = a.length;

        int final_ans = count_num(a,n,2);

        System.out.println(final_ans);
    }
    
}
