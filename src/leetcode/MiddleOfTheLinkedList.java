package leetcode;

import java.util.LinkedList;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        LinkedList<ListNode> queue = new LinkedList<>();
        ListNode curr = head;
        int travel = 0;
        while (curr != null) {
            queue.add(curr);
            if (++travel == 2) {
                queue.poll();
                travel = 0;
            }
            curr = curr.next;
        }
        return queue.peek();
    }

    public ListNode twoPointers(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
