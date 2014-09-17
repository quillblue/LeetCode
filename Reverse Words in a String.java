public class Solution {
	public String reverseWords(String s) {
        String[] wordList=s.split(" ");
        String result="";
        for(int i=wordList.length-1;i>=0;i--)
        {
        	if(wordList[i].length()>0){
        		result+=wordList[i].trim()+" ";
        	}
        }
        if(result.length()!=0)
        {
        	result=result.substring(0, result.length()-1);
        }
        return result;
    }
}