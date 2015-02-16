package com.quillblue.LeetCode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head, slow=head;
        while(slow!=null){
            slow=slow.next;
            if(fast.next!=null&&fast.next.next!=null){
                fast=fast.next.next;
            }
            else{
                return false;
            }
            if(slow==fast){return true;}
        }
        return false;
    }
}