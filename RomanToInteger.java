public class Solution {
    public int romanToInt(String s) {
        int lastNum=0;
        int result=0;
        for(int i=s.length()-1;i>=0;i--){
            int current=toInt(s.charAt(i));
            if(current>=lastNum){
                result+=current;
                lastNum=current;
            }
            else{
                result-=current;
            }
        }
        return result;
    }
    
    private int toInt(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}