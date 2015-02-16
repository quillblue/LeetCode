package com.quillblue.LeetCode;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
         if (prices.length == 0) {
             return 0 ;
         }      
         int max = 0 ;
         int soFarMin = prices[0] ;
         for (int i = 0 ; i < prices.length ; ++i) {
             if (prices[i] > soFarMin) {
                 max = Math.max(max, prices[i] - soFarMin) ;
             } else{
                soFarMin = prices[i];
             }
         }       
        return  max ;
    }
}