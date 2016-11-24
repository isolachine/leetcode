package leetcode;

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode[] listNodes = new ListNode[n];
        ListNode next = head;
        int i = 0;
        int round = 0;
        while (next.next != null) {
            listNodes[i] = next;
            next = next.next;
            if (i + 1 < n) {
                i++;
            } else {
                i = 0;
                round++;
            }
        }
        if (round == 0) {
            return head.next;
        }
        if (n == 1) {
            listNodes[i].next = null;
        } else if (n == 2) {
            listNodes[i].next = listNodes[i].next.next;
        } else {
            if (i + 2 < n) {
                listNodes[i].next = listNodes[i + 2];
            } else {
                listNodes[i].next = listNodes[i - n + 2];
            }
        }
        return head;
    }

    public ListNode removeNthFromEndTwoPointer(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        // ListNode b = new ListNode(8);
        // ListNode c = new ListNode(6);
        // ListNode d = new ListNode(10);
        // ListNode e = new ListNode(15);
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;
        ListNode now = removeNthFromEnd(a, 1);
        System.out.print("[" + now.val);
        while (now.next != null) {
            System.out.print(", " + now.next.val);
            now = now.next;
        }
        System.out.print("]");
    }
}
