public class StackArray {

    static int top = -1;
    static int list[];

    public static void main(String[] args) {

        top = -1;
        list = new int[10];

        System.out.println("-----------------------------");

        StackArray new_list = new StackArray();

        new_list.push(5);
        new_list.push(10);
        new_list.push(30);
        new_list.pop();
        // new_list.pop();
        new_list.getTop();
        new_list.print();
        System.out.println("-----------------------------");
    }

    public void push(int item) {
        top++;
        list[top] = item;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.print("List is empty");
        } else {
            top--;
        }
    }

    public void getTop() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("top item is = " + list[top]);
        }
    }

    public void print() {
        for (int i = 0; i < top + 1; i++) {
            System.out.println(list[i]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
