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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addup=0;
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode resultHead=new ListNode(-1);
        ListNode resultCurrent=resultHead;
        while(c1!=null||c2!=null){
            int tempResult=addup;
            if(c1!=null){
                tempResult+=c1.val;
                c1=c1.next;
            }
            if(c2!=null){
                tempResult+=c2.val;
                c2=c2.next;
            }
            addup=tempResult>=10?1:0;
            tempResult=tempResult % 10;
            resultCurrent.next=new ListNode(tempResult);
            resultCurrent=resultCurrent.next;
        }
        if(addup==1){
            resultCurrent.next=new ListNode(1);
        }
        return resultHead.next;
    }
}