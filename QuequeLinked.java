public class QuequeLinked {

    class Node {
        int data;
        Node next;

        Node(int item) {
            data = item;
            next = null;
        }
    }

    static Node front;
    static Node current;
    static Node rear;
    static int length;

    public boolean isEmpty() {
        return length == 0;
        // return rear == null;
    }

    public void enqueue(int newItem) {
        if (isEmpty()) {
            front = new Node(newItem);
            rear = front;
        } else {
            Node new_item = new Node(newItem);
            rear.next = new_item;
            rear = new_item;
        }
        length++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (front == rear) {
            front = null;
            rear = null;
            length = 0;
        } else {
            front = front.next;
            length--;
        }
    }

    public void getFront() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Front is = " + front.data);
        }
    }

    public void getRear() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Rear is = " + rear.data);
        }
    }

    public void print() {
        current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        front = null;
        rear = null;
        length = 0;

        QuequeLinked list = new QuequeLinked();
        System.out.println("------------------------------");
        list.enqueue(5);
        list.enqueue(6);
        list.enqueue(7);
        list.enqueue(8);
        list.dequeue();
        list.getFront();
        list.getRear();
        list.print();
        System.out.println("------------------------------");

    }

}
