package LeetCode.MergeTwoSortedLists_21;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = tail = null;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public void add(int value) {
        if (isEmpty()) {
            head = tail = new Node(value);
        } else {
            head = new Node(value, head);
        }

    }

    public void deleteHead() {
        if (head != null) {
            head = head.getLink();
        } else {
            System.out.println("LinkedList is already empty!");
        }
    }

    public void print() {
        Node position = head;

        System.out.print("{");
        while (position != null) {
            System.out.print(position.getValue() + ",");
            position = position.getLink();
        }
        System.out.println("}");
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node node) {
        head = node;
    }

    public void insert(int value) {
        if (isEmpty()) {
            head = tail = new Node(value);
        } else {
            Node newNode = new Node(value);
            Node current = head;
            Node previous = new Node();
            while (current != null) {
                if (newNode.getValue() < current.getValue()) {
                    if (current == head) {
                        newNode.setLink(head);
                        head = newNode;
                        break;
                    } else {
                        newNode.setLink(current);
                        previous.setLink(newNode);
                        break;
                    }
                } else if (current == tail) {
                    tail.setLink(newNode);
                    newNode.setLink(null);
                    tail = newNode;
                }

                previous = current;
                current = current.getLink();
            }
        }
    }


    public int size() {
        int counter = 0;
        Node position = head;

        while (position != null) {
            counter++;
            position = position.getLink();
        }


        return counter;
    }

}
