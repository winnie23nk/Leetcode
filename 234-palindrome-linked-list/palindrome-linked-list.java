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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            count++;
        }
         ListNode last=rev(slow);
         ListNode first=head;
        for(int i=0;i<=count;i++){
            if(first.val==last.val){
                first=first.next;
                last=last.next;
            }else{
                return false;
            }
        }return true;
        
    }
    public ListNode rev(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        ListNode third=second.next;
        while(second!=null){
            third=second.next;
            second.next=first;
            first=second;
            second=third;
        }
        return first;
    }

}