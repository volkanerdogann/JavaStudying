package LeetCode.AddTwoNumbers_2;

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();


        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);

        l1.print();
        l2.print();

        l1.addNumbers();
        l2.addNumbers();

        System.out.println(addTwoNumbers(l1,l2));
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        int list3 = 0;

        list3 = l1.addNumbers() + l2.addNumbers();

        System.out.println(list3);


        while (list3 > 0) {
            l3.add(list3 % 10);
            list3 /= 10;
        }

        return l3;
    }
}
