public class Solution {
    public boolean isValid(String s) {
        Stack<Character> tempStack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            Character current=s.charAt(i);
            if(current=='('||current=='['||current=='{'){
                tempStack.add(current);
            }
            else{
                if(tempStack.size()==0){return false;}
                Character top=tempStack.pop();
                if(top=='('&&current!=')'){return false;}
                if(top=='['&&current!=']'){return false;}
                if(top=='{'&&current!='}'){return false;}
            }
        }
        return tempStack.size()==0;
        
    }
}