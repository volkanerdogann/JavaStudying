package LeetCode.MergeTwoSortedLists_21;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(4);
        linkedList2.insert(1);
        linkedList2.insert(3);
        linkedList2.insert(4);


        linkedList1.print();
        linkedList2.print();

        LinkedList linkedList3 = mergeTwoLists(linkedList1, linkedList2);
        linkedList3.print();
    }


    public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {

        LinkedList list3 = new LinkedList();

        Node position = list1.getHead();
        Node position2 = list2.getHead();

        while (position != null) {
            list3.insert(position.getValue());
            position = position.getLink();
        }

        while (position2 != null) {
            list3.insert(position2.getValue());
            position2 = position2.getLink();
        }
        return list3;
    }

}

