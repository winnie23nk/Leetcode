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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int count=0;
        while(count!=k%size){
            ListNode first=head;
            ListNode second=head;
            while(second.next!=null){
                first=second;
                second=second.next;
            }
            ListNode dummy=new ListNode(second.val);
            dummy.next=head;
             first.next=null;
           head=dummy;
           count++;
        }
        return head;
    }
}