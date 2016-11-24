/*
 * 141. Linked List Cycle
 * 
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up:
 * Can you solve it without using extra space?
 */
/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Set<ListNode> nodes = new HashSet<ListNode>();
        nodes.add(head);
        while (head.next != null) {
            if (nodes.contains(head)) {
                return true;
            } else {
                nodes.add(head.next);
            }
            head = head.next;
        }
        return false;
    }
    
    public boolean hasCycleTwoPointers(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(10);
        ListNode e = new ListNode(15);
        a.next = b;
        b.next = c;
        c.next = b;
        d.next = a;
        e.next = a;
        boolean cycle = hasCycle(a);
        System.out.print(cycle);
    }
}
