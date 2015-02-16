package com.quillblue.LeetCode;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>1){
            count+=n/5;
            n/=5;
        }
        return count;
    }
}