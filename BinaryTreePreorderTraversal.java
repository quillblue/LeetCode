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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){return new ArrayList<Integer>();}
        List<Integer> result=new ArrayList<Integer>();
        result.add(root.val);
        if(root.left!=null){
            result.addAll(preorderTraversal(root.left));
        }
        if(root.right!=null){
            result.addAll(preorderTraversal(root.right));
        }

        return result;
    }
}