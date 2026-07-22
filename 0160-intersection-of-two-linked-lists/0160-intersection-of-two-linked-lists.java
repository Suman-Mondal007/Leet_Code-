/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA,t2=headB;
        int s1=0,s2=0;
        while(t1!=null){
            s1++;
            t1=t1.next;
        }
        while(t2!=null){
            s2++;
            t2=t2.next;
        }
        if(s2>s1){
            int diff=s2-s1;
            t2=headB;
            for(int i=0;i<diff;i++){
                t2=t2.next;
            }
            t1=headA;
            while(t1!=t2){
                t1=t1.next;
                t2=t2.next;
            }
            return t1;
        }if(s1>s2){
            int diff=s1-s2;
            t1=headA;
            for(int i=0;i<diff;i++){
                t1=t1.next;
            }
            t2=headB;
            while(t1!=t2){
                t1=t1.next;
                t2=t2.next;
            }
            return t1;
        }
        else{
            while(headA!=headB){
                headA=headA.next;
                headB=headB.next;
            }
            return headA;
        }
        
    }

}