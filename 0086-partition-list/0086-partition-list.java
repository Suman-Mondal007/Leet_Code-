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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller=new ListNode(-1);
        ListNode larger=new ListNode(-1);
        ListNode s=smaller;
        ListNode l=larger;

        while(head!=null){
            if(head.val<x){
                s.next=head;
                s=s.next;
            }else{
                l.next=head;
                l=l.next;
            }
            head=head.next;
        }
        l.next=null;
        s.next=larger.next;
        return smaller.next;
    }
}