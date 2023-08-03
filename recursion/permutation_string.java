package recursion;

public class permutation_string 
{
    public static void print_permu(String ques , String ans)
    {
        int n = ques.length();
        if(n==0)
        {
            System.out.print(ans);
            return;
        }
        for(int i=0;i<n;i++)
        {
            char ch = ques.charAt(i);
            String lp = ques.substring(0, i);
            String rp = ques.substring(i+1);
            String ros = lp+rp;
            print_permu(ros,ans+ch);
        }

    }

    public static void main(String [] args)
    {
        String ques = "abc";
        print_permu(ques," ");
    }
    
}
