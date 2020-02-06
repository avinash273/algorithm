package DoublyLinkedList;

public class DLinkedList {
    private DLinkNode head;

    public void insertAtHead(int data) {
        DLinkNode newNode = new DLinkNode(data);
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    @Override
    public String toString() {
        DLinkNode current = this.head;
        String result = "{";
        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
