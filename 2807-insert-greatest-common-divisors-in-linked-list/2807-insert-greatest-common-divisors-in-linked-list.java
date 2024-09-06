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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode prev=head;
        ListNode temp=null;
        if(head.next!=null) temp=head.next;
        else return head;
        while(temp!=null)
        {
            int ans=gcd(temp.val,prev.val);
            ListNode gcd=new ListNode(ans);
            prev.next=gcd;
            gcd.next=temp;
            prev=temp;
            temp=temp.next;
        }
        return head;
        
    }
    static int gcd(int a , int b)
    {
        if(a==0) return b;
        if(b==0) return a;
        return gcd(b,a%b);
    }
}