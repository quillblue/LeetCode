public class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] min=grid[0];
        for(int j=1;j<n;j++){
            min[j]+=min[j-1];
        }
        for(int i=1;i<m;i++){
            min[0]+=grid[i][0];
            for(int j=1;j<n;j++){
                min[j]=Math.min(min[j-1],min[j])+grid[i][j];
            }
        }
        return min[n-1];
    }
}