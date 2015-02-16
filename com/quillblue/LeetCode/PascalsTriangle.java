package com.quillblue.LeetCode;

import java.util.*;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> resultSet=new ArrayList<List<Integer>>();
        if(numRows==0){return resultSet;}
        List<Integer> first=new ArrayList<Integer>();
        first.add(1);
        resultSet.add(first);
        if(numRows==1){return resultSet;}
        List<Integer> last=first;
        for(int i=2;i<=numRows;i++){
            List<Integer> current=new ArrayList<Integer>();
            current.add(1);
            for(int j=0;j<last.size()-1;j++){
                current.add(last.get(j)+last.get(j+1));
            }
            current.add(1);
            resultSet.add(current);
            last=current;
        }
        return resultSet;
    }
}