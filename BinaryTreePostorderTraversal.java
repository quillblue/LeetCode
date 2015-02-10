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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if (root == null) return result;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        Set<TreeNode> set = new HashSet<TreeNode>();
        while (!stk.isEmpty()) {
            TreeNode current = stk.pop();
            if (set.contains(current)) {
                result.add(current.val);
                set.remove(current);
            } else {           // first time
                set.add(current);
                stk.push(current);
                if (current.right != null) stk.push(current.right);
                if (current.left != null) stk.push(current.left);
            }
        }
        return result;
    }
}