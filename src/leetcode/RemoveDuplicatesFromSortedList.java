package leetcode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        deleteDuplicatesHelper(head);
        return head;
    }

    public static void deleteDuplicatesHelper(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        if (head.val == head.next.val) {
            if (head.next.next != null) {
                head.next = head.next.next;
            } else {
                head.next = null;
            }
            deleteDuplicatesHelper(head);
        } else {
            deleteDuplicatesHelper(head.next);
        }
    }

    public ListNode deleteDuplicatesSimple(ListNode head) {

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode now = deleteDuplicates(a);
        System.out.print("[" + now.val);
        while (now.next != null) {
            System.out.print(", " + now.next.val);
            now = now.next;
        }

        System.out.print("]");
    }
}
