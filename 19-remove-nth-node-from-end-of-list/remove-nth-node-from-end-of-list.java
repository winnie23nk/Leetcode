/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy=new ListNode(0,head);
        ListNode last=dummy;
      int count=0;
      while(last.next!=null){
        last=last.next;
        count++;
      }
      ListNode prev=dummy;
      int count2=0;
      while(count2!=count-n){
        prev=prev.next;
        count2++;
      }
      ListNode curr=prev.next;
      prev.next=curr.next;

       return dummy.next;
    }
}