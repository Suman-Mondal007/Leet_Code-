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
        if(head==null || head.next==null){
            return head;
        }
        int size=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        k=k%size;
        temp.next=head;
        ListNode res=head;
        for(int i=0;i<size-k-1;i++){
            res=res.next;
        }
        ListNode newHead=res.next;
        res.next=null;
        return newHead;
    }
}