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
        if(head==null||head.next==null){
            return true;
        }
       
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode middle=slow;
         ListNode beg=middle.next;
         ListNode mid=beg.next;
         while(mid!=null){
            ListNode end=mid.next;
            mid.next=beg;
            beg=mid;
            mid=end;
         }
         middle.next.next=null;
         ListNode last=beg;
         ListNode first=head;
         while(last!=null){
            if(first.val!=last.val)
            return false;
            first=first.next;
            last=last.next;
         }
         return true;


    }
}