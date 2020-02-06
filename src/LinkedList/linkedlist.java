package LinkedList;

public class linkedlist {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length() {
        int length = 0;
        Node starter = this.head;
        while (starter != null) {
            starter = starter.getNextNode();
            length++;
        }
        return length;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
