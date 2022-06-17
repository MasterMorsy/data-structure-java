public class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int item) {
            data = item;
            next = null;
        }
    }

    static Node head;
    static Node current;

    public void push(int newItem) {
        Node new_node = new Node(newItem);
        new_node.next = head;
        head = new_node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public void getTop() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Top is = " + head.data);
        }
    }

    public void print() {
        current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        head = null;

        StackLinkedList new_list = new StackLinkedList();
        System.out.println("------------------------------");
        new_list.push(5);
        new_list.push(6);
        new_list.push(7);
        new_list.push(8);
        new_list.pop();
        new_list.getTop();
        new_list.print();
        System.out.println("------------------------------");

    }

}