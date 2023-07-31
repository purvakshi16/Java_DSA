package arrays;
import java.util.ArrayList;
public class arraylist {

    public static void main(String args[])
    {
        ArrayList<Integer>list = new ArrayList<>();
        
        // addition or addition at last
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        

        //size of list
        System.out.println(list.size());


        // insertion 
        list.add(2,20);
        System.out.println(list);

        //deletion
        list.remove(2);
        System.out.println(list);

        // get element of particual index
        System.out.println(list.get(3));

        //





    }
    
}
