package recursion.Backtracking;

import java.util.HashMap;
import java.util.Scanner;

public class rep_str 
{
    // position decides 
    public static void wordPermutation1(int currPos , int totalPos , HashMap<Character,Integer> freqMap , String asf)
    {
        if(currPos>totalPos)
        {
            System.out.println(asf);
            return;
        }
        for(char k : freqMap.keySet())
        {
            freqMap.put(k,freqMap.get(k)-1);
            wordPermutation1(currPos+1, totalPos,freqMap , asf+k);
            freqMap.put(k,freqMap.get(k)+1);
        }
    }

    // string decides
    public static void wordPermutation2(String word,int idx,HashMap<Character,Integer> lastPosUsed,Character[] position)
    {
        if(idx == word.length())
        {
            for(char ch : position)
            {
                System.out.print(ch);
            }
            System.out.println();
            return;
        }
        
        char ch = word.charAt(idx);
        int lastidx = lastPosUsed.get(ch);
        for(int i= lastidx;i<word.length();i++)
        {
            if(position[i]==null)
            {
                position[i]=ch;
                lastPosUsed.put(ch,i);
                wordPermutation2(word, idx+1, lastPosUsed, position);
                position[i]=null;
                lastPosUsed.put(ch,lastidx);
            }
            
        }
    }
    
    public static void printPermutations2(String word){
        HashMap<Character,Integer> lastPosUsed = new HashMap<>();

        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            lastPosUsed.put(ch,-1);
        }

        wordPermutation2(word,0,lastPosUsed,new Character[word.length()]);
    }
    
    public static void printPermutations1(String word){
        HashMap<Character,Integer> freqMap = new HashMap<>();

        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        
        wordPermutation1(1,word.length(),freqMap,"");
    }
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
       // printPermutations1(word);
        printPermutations2(word);
    }
}
