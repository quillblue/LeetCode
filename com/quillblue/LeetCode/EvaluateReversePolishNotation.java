package com.quillblue.LeetCode;
import java.util.*;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> processStack=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                processStack.push(Integer.valueOf(tokens[i]));
            }
            else{
                int num2=processStack.pop();
                int num1=processStack.pop();
                processStack.push(calculate(num1,num2,tokens[i]));
            }
        }
        return processStack.pop();
    }
    
    protected int calculate(int num1, int num2, String operand)
    {
        if (operand.equals("+")) {
            return num1 + num2;
        } else if (operand.equals("-")) {
            return num1 - num2;
        } else if (operand.equals("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }
}