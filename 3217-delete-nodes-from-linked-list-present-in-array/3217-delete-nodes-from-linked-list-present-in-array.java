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
//     public ListNode modifiedList(int[] nums, ListNode head) {
    //     ListNode temp=head;
    //     ArrayList<Integer> al = new ArrayList<>();
    //     ArrayList<Integer> al1 = new ArrayList<>();
    //     ArrayList<Integer> al2 = new ArrayList<>();
    //     for(int i :nums) al2.add(i);
    //     while(temp!=null)
    //     {
    //         al.add(temp.val);
    //         temp=temp.next;
    //     }
    //     // System.out.println(al);
    //     for(int i:al)
    //     {
    //         if(!al2.contains(i))
    //         {
    //             al1.add(i);
    //         }
    //     }
    //     // System.out.println(al1);
    //     ListNode dummy = new ListNode();
    //     ListNode current = dummy;
    //     for (int i : al1) {
    //         current.next = new ListNode(i);
    //         current = current.next;
    //     }
    // return dummy.next;
    // }

// }
import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Use a HashSet for faster lookups
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        // Dummy node to simplify list building
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // Traverse the original linked list
        while (head != null) {
            // If the value is not in the set, add it to the new list
            if (!set.contains(head.val)) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }

        // Return the new list starting from dummy.next
        return dummy.next;
    }
}
