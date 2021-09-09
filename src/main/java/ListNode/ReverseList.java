package ListNode;


//  Definition for singly-linked list.


class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current.next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        current.next = prev;
        head = current;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        System.out.println(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            System.out.println(listNode.val);
        }
    }



}