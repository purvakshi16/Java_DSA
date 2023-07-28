package recursion;
import java.util.ArrayList;
public class getsubseq {

    static ArrayList<String> getSubSeq(String ques){
        if(ques.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        String ros = ques.substring(1);
        ArrayList<String> subSeqOfROS = getSubSeq(ros);

        ArrayList<String> mySubSeq = new ArrayList<>();

        // char excluded
        for(String s : subSeqOfROS){
            mySubSeq.add(s);
        }

        // char included
        for(String s : subSeqOfROS){
            mySubSeq.add(ques.charAt(0) + s);
        }

        return mySubSeq;
    } 
    
    static void printSubSeq(String ques,String asf)
    {
        if(ques.length() == 0) 
        {
           System.out.println(asf);
           return;
        }
        char ch = ques.charAt(0);
         String ros = ques.substring(1);
         // exclude
         printSubSeq(ros,asf);

         // include
         printSubSeq(ros,asf+ch);

    }


    public static void main(String args[])
    {
        System.out.println(getSubSeq("abc"));
        printSubSeq("abc","");
    }    
}
