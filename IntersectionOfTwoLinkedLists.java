/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){return null;}
        ListNode temp=headB;
        int lengthB=1;
        while(temp.next!=null){
            temp=temp.next;
            lengthB+=1;
        }
        temp.next=headB;
        ListNode slow=headA;
        ListNode fast=headA;
        for(int i=0;i<lengthB;i++){
            if(fast==null){
                temp.next=null;
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null&&slow!=null){
            if(fast==slow){
                temp.next=null;
                return slow;
            }
            fast=fast.next;
            slow=slow.next;
        }
        temp.next=null;
        return null;
    }
}