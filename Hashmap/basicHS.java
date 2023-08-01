package Hashmap;
import java.util.HashSet;

public class basicHS {
    public static void main(String []args)
    {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);
        hs.add(30);
        System.out.println(hs);

        System.out.println(hs.size());

        hs.remove(30);
        System.out.println(hs);

        for(int val : hs)
        {
            System.out.println(val );
        }

        System.out.println(hs.contains(20));
        
    }
    
}
