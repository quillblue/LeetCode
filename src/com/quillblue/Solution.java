package src.com.quillblue;

import java.util.*;

/**
 * Created by Sharon on 2015-02-10.
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[] arr = new int[m];
        int flag=1;
        for (int i = 0; i < m; i++) {
            if(flag==0||obstacleGrid[0][i]==0){flag=0;}
            arr[i] = flag;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(obstacleGrid[j][i]==1){arr[j]=0;}
                else{arr[j] = arr[j] + arr[j-1];}
            }
        }
        return arr[m-1];
    }

}
