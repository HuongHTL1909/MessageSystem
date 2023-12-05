public class Queue {

    public Node head;
    public Node tail;
    public int size;

    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }
    boolean isEmpty() {
        return head == null;
    }
    void enqueue(Node node) {
        if (isEmpty()) {
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    Node dequeue() {
        Node node  = null;
        try {
            node = head;
            head = head.next;
        }catch(Exception e){
            System.out.println("Empty Queue!");
        }
        return node;
    }

}






