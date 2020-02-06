package DoublyLinkedList;

public class DLinkNode {
    private int data;
    private DLinkNode nextNode;
    private DLinkNode previousNode;

    public DLinkNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLinkNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DLinkNode nextNode) {
        this.nextNode = nextNode;
    }

    public DLinkNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DLinkNode previousNode) {
        this.previousNode = previousNode;
    }
}
