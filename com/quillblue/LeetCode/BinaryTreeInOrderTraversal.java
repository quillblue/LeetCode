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
public class BinaryTreeInOrderTraversal {
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> inOrder = new LinkedList<Integer>();
        if (root == null) return inOrder;
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
                inOrder.add(current.val);
                current=current.right;
            }
        }    
        return inOrder;
    }
}