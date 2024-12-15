public class Main {
  public static void main(String[] args)  {
    LinkedListOperations linkedListOperations = new LinkedListOperations();
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    // Head 2
    Node head2 = new Node(9);
    head2.next = new Node(9);
    head2.next.next = new Node(9);
    head2.next.next.next = new Node(9);
    // ------------------------------------
    System.out.println("Original linked list: ");
    linkedListOperations.printLinkedList(head);
    System.out.println("Reverse linked list: ");
//    head = linkedListOperations.reverseLinkedList(head);
    head = linkedListOperations.recursive_reverse(head);
    linkedListOperations.printLinkedList(head);
    linkedListOperations.printLinkedList(linkedListOperations.addOneToLinkedList(head));
    linkedListOperations.printLinkedList(linkedListOperations.addOneToLinkedList(head2));

  }
}
