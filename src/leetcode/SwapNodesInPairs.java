package leetcode;

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = head.next;
        ListNode temp;
        while (head.next != null && head.next.next != null) {
            temp = head.next.next;
            head.next.next = head;
            if (temp.next != null) {
                head.next = temp.next;
            } else {
                head.next = temp;
            }
            head = temp;
        }
        if (head.next != null) {
            head.next.next = head;
            head.next = null;
        }
        return res;
    }

    public static ListNode swapPairsRecursive(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode n = head;
        ListNode m = head.next.next;

        head = head.next;
        head.next = n;
        head.next.next = swapPairs(m);

        return head;
    }

    //dummy
    public ListNode swapPairsDummy(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ListNode now = swapPairsRecursive(a);

        System.out.print("[" + now.val);
        while (now.next != null) {
            System.out.print(", " + now.next.val);
            now = now.next;
        }

        System.out.print("]");
    }
}
