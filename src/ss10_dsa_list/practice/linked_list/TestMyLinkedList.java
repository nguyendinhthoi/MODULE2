package ss10_dsa_list.practice.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList o = new MyLinkedList(10);

        o.addFirst(11);
        o.addFirst(12);
        o.addFirst(13);

        o.add(4,9);
        o.add(4,9);


        o.printList();
    }
}
