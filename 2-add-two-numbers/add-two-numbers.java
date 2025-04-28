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
    ListNode head;
    public void add(int val){
        ListNode newnode= new ListNode(val);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         Solution ll= new Solution();
         int count1=0;
         int count2=0;
         ListNode temp1=l1;
         ListNode temp2=l2;
         
         while(temp1!=null){
            count1++;
            temp1=temp1.next;
         }
         while(temp2!=null){
            count2++;
            temp2=temp2.next;
         }

    
        while(l1!=null||l2!=null){
          int o1=(l1!=null)?l1.val:0;
          int o2=(l2!=null)?l2.val:0;
          int sum=o1+o2;
            if(sum<10){
                ll.add(sum);
            }
            else{
                ll.add(sum-10);
                if(count1>=count2){
                if(l1.next==null){
                    ll.add(sum/10);
                }else{
                l1.next.val+=sum/10;
                }
                }
                else{
                  if(l2.next==null){
                    ll.add(sum/10);
                }else{
                l2.next.val+=sum/10;
                }  
                }
            }
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return ll.head;
    }
}