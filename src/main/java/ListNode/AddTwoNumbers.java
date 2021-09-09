package ListNode;


public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode result = null;
        ListNode node1 = l1;
        ListNode node2 = l2;
        int nextPlus = 0;



        return result;
    }

    public static void main(String[] args) {
        ListNode listNode = addTwoNumbers(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        System.out.println(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            System.out.println(listNode.val);
        }
    }
}
