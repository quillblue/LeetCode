package com.quillblue.LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength=99999999;
        if(strs.length==0){return "";}
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLength){
                minLength=strs[i].length();
            }
        }
        if(minLength==0){return "";}
        for(int i=0;i<minLength;i++){
            char firstStringCurrent=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=firstStringCurrent){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLength);
    }
}