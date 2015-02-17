package com.quillblue.LeetCode.Test;

import java.util.*;

/**
 * Created by Sharon on 2015-02-10.
 */
public class Solution {
    public int removeDuplicates(int[] A) {
        List<Integer> occurList=new ArrayList<Integer>();
        if(A.length<3){return A.length;}
        occurList.add(A[0]);
        occurList.add(A[1]);
        int count=2;
        for(int i=2;i<A.length;i++){
            if(occurList.get(count-1)!=A[i]||occurList.get(count-1)!=A[i]){
                occurList.add(A[i]);
                count++;
            }
        }
        for(int i=0;i<count;i++){A[i]=occurList.get(i);}
        return count;
    }
}