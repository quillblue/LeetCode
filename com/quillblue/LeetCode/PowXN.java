package com.quillblue.LeetCode;

public class PowXN {
    public double pow(double x, int n) {
        if(x==0 && n==0){
           return 0;  
        } 
        if(n == 0){
            return 1;
        }
        if (n > 0){
            return 1.0/pow(x, -n);
        }
        else{
            double v = pow(x, n/2);
            if (n%2 == 0){
                return v*v;
            }
            else{
                return v*v/x;
            }
        }
    }
}