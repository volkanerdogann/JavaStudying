package LeetCode.MergeTwoSortedLists_21;

public class Node {
    private int value;
    private Node link;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        link = null;
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
