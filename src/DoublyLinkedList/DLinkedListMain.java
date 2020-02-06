package DoublyLinkedList;

public class DLinkedListMain {
    public static void main(String[] args){
        DLinkedList insert = new DLinkedList();
        insert.insertAtHead(1);
        insert.insertAtHead(2);
        insert.insertAtHead(3);
        insert.insertAtHead(4);
        insert.insertAtHead(5);
        insert.insertAtHead(6);

        System.out.println(insert);

    }
}
