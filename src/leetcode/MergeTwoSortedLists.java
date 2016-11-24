package leetcode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        mergeTwoListsHelper(l1, l2, newList);
        return newList.next;
    }

    public static void mergeTwoListsHelper(ListNode l1, ListNode l2, ListNode newList) {
        if (l1 == null) {
            newList.next = l2;
            return;
        } else {
            if (l2 == null) {
                newList.next = l1;
                return;
            } else {
                if (l1.val >= l2.val) {
                    newList.next = l2;
                    mergeTwoListsHelper(l1, l2.next, newList.next);
                } else {
                    newList.next = l1;
                    mergeTwoListsHelper(l1.next, l2, newList.next);
                }
            }
        }
    }

    public static ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoListsRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRecursive(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(10);
        ListNode e = new ListNode(15);
        a.next = b;
        c.next = d;
        d.next = e;
        ListNode now = mergeTwoLists(a, c);
        System.out.print("[" + now.val);
        while (now.next != null) {
            System.out.print(", " + now.next.val);
            now = now.next;
        }
        System.out.print("]");
    }
}
