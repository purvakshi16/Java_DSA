package Hashmap;
import java.util.HashMap;
public class basicsHM {
    public static void main(String []args)
    {
        HashMap<String,Integer> hm = new HashMap<>();
        
        // insert
        hm.put("india",100);
        System.out.println(hm);
        hm.put("dubai",200);
        System.out.println(hm);
        hm.put("australia",300);
        System.out.println(hm);
        hm.put("xyz",400);
        System.out.println(hm);
        hm.put("korea",500);
        System.out.println(hm);
        hm.put("japan",600);
        System.out.println(hm);

        // update
        hm.put("india",700);
        System.out.println(hm); 

        // retrive
        int val = hm.get("korea");
        System.out.println(val);
        
        //size
        System.out.println(hm.size());

        // ket set
        System.out.println(hm.keySet());

        //removal
        int val1 = hm.remove("xyz");
        System.out.println(val1);

        //search
        System.out.println( hm.containsKey("korea") );
        System.out.println( hm.containsKey("china") );

        // loop
        for(String k : hm.keySet())
        {
            System.out.println(hm.get(k));
        }



    
    }

    
}
