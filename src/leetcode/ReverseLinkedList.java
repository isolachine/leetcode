package leetcode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        head.next = null;
        ListNode res = reverseListHelper(temp, head);
        return res;
    }
    
    private static ListNode reverseListHelper(ListNode currentNode, ListNode previousNode) {
        if (currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            return reverseListHelper(nextNode, currentNode);
        }
        currentNode.next = previousNode;
        return currentNode;
    }
    
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode now = reverseList(a);
        System.out.print("[" + now.val);
        while (now.next != null) {
            System.out.print(", " + now.next.val);
            now = now.next;
        }

        System.out.print("]");
    }
}
