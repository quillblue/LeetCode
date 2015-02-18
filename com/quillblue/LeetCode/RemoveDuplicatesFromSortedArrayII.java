package com.quillblue.LeetCode;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] A) {
        if(A.length <2){return A.length;}
        int buf=0;
        int count=2;
        for(int i=2;i<A.length;i++){
            buf = A[count-2];
            if(A[i] != buf){
                A[count] = A[i];
                count++;
            }
        }
        return count;
    }
}