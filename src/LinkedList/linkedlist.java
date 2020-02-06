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

    public void deleteFromHead() {
        Node start = this.head;
        this.head = start.getNextNode();
    }

    public Node search(int data){
        Node start = this.head;
        while (start != null){
            if (start.getData() == data ){
                return start;
            }
            start = start.getNextNode();
        }
        return null;
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
