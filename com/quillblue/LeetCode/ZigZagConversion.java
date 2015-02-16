package com.quillblue.LeetCode;

public class ZigZagConversion {
    public String convert(String s, int nRows) {
        if(nRows==1){return s;}
        String result="";
        String[] tempList=new String[nRows];
        for(int i=0;i<nRows;i++){
            tempList[i]="";
        }
        int currentRow=0;
        int direction=-1;
        for(int i=0;i<s.length();i++){
            tempList[currentRow]+=String.valueOf(s.charAt(i));
            if(currentRow==0||currentRow==nRows-1){
                direction=-1*direction;
            }
            currentRow+=direction;
        }
        for(int i=0;i<nRows;i++){
            result+=tempList[i];
        }
        return result;
    }
}