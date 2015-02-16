package com.quillblue.LeetCode;
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
               result[0]=map.get(numbers[i]);
               result[1]=i+1;
               return result;
            }
            else{
                map.put(target-numbers[i],i+1);
            }
        }
        return result;
    }
}