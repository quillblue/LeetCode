package com.quillblue.LeetCode;
import java.util.*;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null){return result;}
        List<List<Integer>> reversedResult=new ArrayList<List<Integer>>();
        List<TreeNode> currentLevel=new ArrayList<TreeNode>();
        List<TreeNode> nextLevel=new ArrayList<TreeNode>();
        currentLevel.add(root);
        while(currentLevel.size()!=0){
            List<Integer> currentVal=new ArrayList<Integer>();
            for(int i=0;i<currentLevel.size();i++){
                currentVal.add(currentLevel.get(i).val);
                if(currentLevel.get(i).left!=null){
                    nextLevel.add(currentLevel.get(i).left);
                }
                if(currentLevel.get(i).right!=null){
                    nextLevel.add(currentLevel.get(i).right);
                }
                
            }
            currentLevel=nextLevel;
            nextLevel=new ArrayList<TreeNode>();
            reversedResult.add(currentVal);
        }
        for(int i=reversedResult.size()-1;i>=0;i--){
            result.add(reversedResult.get(i));
        }
        return result;
    }
}