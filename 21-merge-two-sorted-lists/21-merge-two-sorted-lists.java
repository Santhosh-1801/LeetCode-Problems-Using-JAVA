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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode head=new ListNode();
        ListNode a=head;
        while(list1!=null && list2!=null)
        {
           if(list1.val<list2.val)
           {
               a.next=list1;
               list1=list1.next;
               a=a.next;
           }
           else
           {
               a.next=list2;
               list2=list2.next;
               a=a.next;
           }
            
        }
        if(list1!=null)
        {
            a.next=list1;
        }
        else
        {
            a.next=list2;
        }
        return head.next;
        
    }
}