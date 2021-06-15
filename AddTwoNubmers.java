public class AddTwoNubmers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 2 ;
        l1.next.val =4;
        l1.next.next.val = 3;

        //addTwoNumbers();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return null;
    }

    /**
     * Definition for singly-linked list.

     */
     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
