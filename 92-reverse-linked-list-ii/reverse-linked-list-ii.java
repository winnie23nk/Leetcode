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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      ListNode leftpoint=dummy;
      int count=0;
      while(count!=left-1){
        leftpoint=leftpoint.next;
        count++;
      }
     
      
      ListNode first=leftpoint.next;
      ListNode second=first.next;
       ListNode third=null;
     int count2=0;

        while(count2!=right-left){
            third=second.next;
            second.next=first;
            first=second;
            second=third;
            count2++;
        }
        leftpoint.next.next=third;
        leftpoint.next=first;
        
        return dummy.next;
    }
}
