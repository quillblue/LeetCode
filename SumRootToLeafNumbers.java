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
    public int sumNumbers(TreeNode root) {
        int sum=0;
        if(root==null){return 0;}
        Stack<TreeNode> waitedList=new Stack<TreeNode>();
        waitedList.push(root);
        while(waitedList.size()>0){
            TreeNode current=waitedList.pop();
            if(current.left==null&&current.right==null){
                sum+=current.val;
            }
            if(current.left!=null){
                current.left.val=current.val*10+current.left.val;
                waitedList.push(current.left);
            }
            if(current.right!=null){
                current.right.val=current.val*10+current.right.val;
                waitedList.push(current.right);
            }
        }
        return sum;
    }
}