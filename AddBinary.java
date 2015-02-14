public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sba = new StringBuilder(a);
        sba.reverse();
        StringBuilder sbb = new StringBuilder(b);
        sbb.reverse();
        int maxLen = Math.max(a.length(), b.length());
        StringBuilder result = new StringBuilder();
        int addOne = 0;

        for(int i = 0; i < maxLen; i++){
            char ca = (i < sba.length()) ? sba.charAt(i) : '0';
            char cb = (i < sbb.length()) ? sbb.charAt(i) : '0';
            if(ca == cb){
                result.append(addOne);
                addOne = (ca == '0') ? 0 : 1;
            }else{
                result.append(1 - addOne);
                addOne = (addOne == 1) ? 1 : 0;
            }
        }

        result = (addOne == 0) ? result : result.append(1);
        result.reverse();
        return result.toString();
    }
}