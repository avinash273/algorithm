package LinkedList;


public class LinkedListMain {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.deleteFromHead();
        list.deleteFromHead();
        Node pointer = list.search(31);

        System.out.println("Search Pointer: " + pointer);

        System.out.println(list);
        System.out.println("Length: " + list.length());


    }
}
