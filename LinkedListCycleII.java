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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head, slow=head;
        int slowPast=0,fastPast=0;
        while(slow!=null){
            slow=slow.next;
            slowPast+=1;
            if(fast.next!=null&&fast.next.next!=null){
                fast=fast.next.next;
                fastPast+=2;
            }
            else{
                return null;
            }
            if(slow==fast){
                int delta=fastPast-slowPast;
                fast=head;
                slow=head;
                for(int i=0;i<delta;i++){
                    fast=fast.next;
                }
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}