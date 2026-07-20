package DAY22;

public class deleteinlinkedlist {
        public void deleteNode(ListNode node) {

            node.val = node.next.val;
            node.next = node.next.next;

        }
    }
