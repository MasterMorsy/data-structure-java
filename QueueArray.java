import java.util.Queue;

public class QueueArray {

    static int front;
    static int rear;
    static int length;
    static int count;
    static int[] arr;

    QueueArray(int size) {
        arr = new int[size];
        front = 0;
        rear = size - 1;
        count = size;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == count;
    }

    public void enqueue(int item) {
        if (isFull())
            System.out.println("List is full!");
        else {
            rear = (rear + 1) % count;
            arr[rear] = item;
            length++;
        }
    }

    public void dequeue() {
        if (isEmpty())
            System.out.println("List is empty!");
        else {
            front = (front + 1) % count;
            length--;
        }
    }

    public int getFront() {
        System.out.println("front value is = " + arr[front]);
        return arr[front];
    }

    public int getRear() {
        System.out.println("rear value is = " + arr[rear]);
        return arr[rear];
    }

    public void print() {

        // circular queque
        for (int i = front; i != rear; i = (i + 1) % count) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[rear]);
    }

    public static void main(String[] args) {

        QueueArray list = new QueueArray(10);
        System.out.println("---------------------------");
        list.enqueue(10);
        list.enqueue(30);
        list.enqueue(40);
        // list.dequeue();
        list.getFront();
        list.getRear();
        list.print();
        System.out.println("---------------------------");

    }
}
