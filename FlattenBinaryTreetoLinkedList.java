/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode resultDummy=new TreeNode(-1);
        TreeNode resultCurrent=resultDummy;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(stack.size()>0){
            TreeNode current=stack.pop();
            if(current.right!=null){stack.push(current.right);}
            if(current.left!=null){stack.push(current.left);}
            resultCurrent.right=current;
            current.left=null;
            resultCurrent=current;
        }
    }
}