package com.quillblue.LeetCode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> lastOccur=new HashMap<Character,Integer>();
        int maxLen=0;
        int lastInterupt=-1;
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(!lastOccur.containsKey(current)){
                lastOccur.put(current,i);
                
            }
            else{
                if(lastInterupt<lastOccur.get(current)){lastInterupt=lastOccur.get(current);}
                lastOccur.remove(current);
                lastOccur.put(current,i);
            }
            if(i-lastInterupt>maxLen){maxLen=i-lastInterupt;}
        }
        return maxLen;
    }
}