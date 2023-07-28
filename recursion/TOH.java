package recursion;
public class TOH 
{

    static void hanoi(int n,String src,String dest,String helper)
    {
        hanoi(n-1,"source","helper","destination");
        System.out.println(n+"["+ src + "->"+ dest +"]");
        hanoi(n-1,"helper","destination","source");
    }
    public static void main(String []args)
    {
        hanoi(3,"source","destination","helper");

    }
    
}
