package com.quillblue.LeetCode;

public class ReverseInteger {
    public int reverse(int x) {
        int negativeFlag=x>0?1:-1;
        int tempNum=x>0?x:-x;
        int result=0;
        while(tempNum!=0){
            result=result*10+tempNum%10;
            tempNum=tempNum/10;
        }
        return result*negativeFlag;
    }
}