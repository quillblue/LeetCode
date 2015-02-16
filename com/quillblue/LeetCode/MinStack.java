package com.quillblue.LeetCode;

class MinStack {
    List<Integer> stackList=new ArrayList<Integer>();
    Stack<Integer> min=new Stack<Integer>();

    public void push(int x) {
        if(stackList.size()==0){
            stackList.add(x);
            min.push(x);
            return;
        }

        stackList.add(x);
        if(x<=min.get(min.size()-1)){min.push(x);}
    }

    public void pop() {
        if(stackList.size()!=0){
            if(stackList.get(stackList.size()-1).equals(min.get(min.size()-1))){
                min.pop();
            }
            stackList.remove(stackList.size()-1);
        }
    }

    public int top() {
        return stackList.get(stackList.size()-1);
    }

    public int getMin() {
        return min.get(min.size()-1);
    }
}
