public class Solution {
    public int singleNumber(int[] A) {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum = sum^A[i];
        }
        return sum;
    }
}