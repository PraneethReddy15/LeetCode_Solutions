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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans= new ListNode[k];
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        int splits=size/k;
        int rem=size%k;
        temp=head;
        ListNode prev=temp;
        for(int i=0;i<k;i++)
        {
            ListNode newPart=temp;
            int currSize=splits;
            if(rem>0)
            {
                rem--;
                currSize++;
            }
            int j=0;
            while(j<currSize){
                prev=temp;
                temp=temp.next;
                j++;
            }
            if(prev!=null){
                prev.next=null;
            }
            ans[i]=newPart;
        }
        return ans;

    }
}