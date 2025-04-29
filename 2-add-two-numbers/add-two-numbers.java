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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(-1);
        ListNode curr=dummy;
        int sum=0;
        int carry=0;
        while(l1!=null||l2!=null){
            sum=carry;
            if(l1!=null){
            sum+=l1.val;
            }
            if(l2!=null){
            sum+=l2.val;
            }
          

            ListNode newnode=new ListNode(sum%10);
            curr.next=newnode;
            curr=curr.next;
             carry=sum/10;
           
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

          




        }
        if(carry!=0){
            ListNode newnode= new ListNode(carry);
            curr.next=newnode;
            curr=curr.next;
        }
        return dummy.next;
        
    }
}