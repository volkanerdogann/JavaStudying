package LeetCode.AddTwoNumbers_2;

public class Node {
    private int value;
    private Node link;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node link) {
        this.value = value;
        this.link = link;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
