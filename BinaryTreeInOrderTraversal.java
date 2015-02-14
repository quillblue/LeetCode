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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new LinkedList<Integer>();
        if (root == null) return inorder;
        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode current=root;
        while(current!=null||!s.empty())
        {
            while(current!=null)
            {
                s.push(current);
                current=current.left;
            }
            if(!s.empty())
            {
                current=s.pop();
                inorder.add(current.val);
                current=current.right;
            }
        }    
        return inorder;
    }
}