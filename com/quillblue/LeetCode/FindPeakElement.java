package com.quillblue.LeetCode;

public class FindPeakElement {
    public int findPeakElement(int[] num) {
        if (num.length<=1){return 0;}
        int mid=0;
        int l=0;
        int h=num.length-1;

        while (l<h){
            mid=(l+h)/2;
            if (num[mid]>num[mid+1]){h=mid;}
            else{
                if (num[mid]<num[mid + 1]){l=mid + 1;}
            }
        }
        return l;
    }
}