package LeetCode.AddTwoNumbers_2;

public class ListNode {
    private int value;
    private Node tail;
    private Node head;


    public ListNode() {
        head = tail = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node position = head;

        System.out.print("{");
        while (position != null) {
            System.out.print(position.getValue()+ ",");
            position = position.getLink();
        }
        System.out.println("}");
    }

    public int addNumbers() {

        int counter = 0;
        int total = 0;

        if (head == null) {
            System.out.println("Empty!");
            return -1;
        } else {
            Node position = head;
            while (position != null) {

                total += (int) Math.pow(10, counter) * position.getValue();
                position = position.getLink();
                counter++;
            }
        }
        return total;
    }

    public void add(int value) {
        if (isEmpty()) {
            head = tail = new Node(value,head);
        } else {
            tail.setLink(new Node(value));
            tail = tail.getLink();
        }
    }
}
