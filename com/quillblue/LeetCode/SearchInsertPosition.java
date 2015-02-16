package com.quillblue.LeetCode;

public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        int i=1;
        int length=A.length;
        if(target<=A[0]){return 0;}
        while(i<A.length)
        {
            if(A[i]>=target){return i;}
            i++;
        }
        return A.length;
    }
}