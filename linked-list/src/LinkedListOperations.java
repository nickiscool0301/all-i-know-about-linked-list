public class LinkedListOperations {
  public Node reverseLinkedList(Node head) {
    Node prev = null;
    Node curr = head;
    while(curr != null) {
      // store next
      Node temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }

  public Node recursive_reverse(Node head) {
    if (head == null) return head;
    Node newHead = head;
    if (newHead.next != null) {
      newHead = recursive_reverse(head.next);
      head.next.next = head;
    }
    head.next = null;
    return newHead;
  }

  public void printLinkedList(Node head) {
    Node curr = head;
    while(curr != null) {
      System.out.print(curr.val + "->");
      curr = curr.next;
    }
    System.out.println("NULL");
  }
}
