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
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         List<Integer> al = new ArrayList<>();
//         for(int i=0;i<lists.length;i++)
//         {
//             ListNode temp=lists[i];
//             while(temp!=null)
//             {
//                 al.add(temp.val);
//                 temp=temp.next;
//             }
//         }
//         Collections.sort(al);
//         // System.out.println(al);
//         if (al == null || al.isEmpty()) return null;
//         ListNode head = new ListNode(al.get(0)); 
//         ListNode current = head;  

//         for(int i=1;i<al.size();i++) 
//         { 
//             ListNode newNode=new ListNode(al.get(i));   
//             current.next = newNode;
//             current = newNode;  
//         }  
    
//     return head;
//     }
// }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode head=lists[0];
        for(int i=1;i<lists.length;i++)
        {
            head=merge2Lists(head,lists[i]);
        }
        return head;
    }
    static ListNode merge2Lists(ListNode head1,ListNode head2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;
        ListNode t1=head1;
        ListNode t2=head2;
        while(t1!=null && t2!=null)
        {
            if(t1.val<t2.val)
            {
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null) temp.next=t1;
        else temp.next=t2;
        return dummy.next;
    }
}