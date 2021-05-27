package max_sk;

import max_sk.list.LinkedList;

import java.util.Iterator;

public class HomeWorkApplication {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        new java.util.LinkedList<>();
        linkedList.addFirst("A");
        linkedList.addFirst("B");
        linkedList.addFirst("C");
        linkedList.addLast("D");
        linkedList.addLast("F");

        System.out.println(linkedList.getElimentByIndex(0));
        linkedList.showAll();

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        Iterator iterator1 = linkedList.descendingIterator();
        while ((iterator1.hasNext())){
            System.out.println(iterator1.next());
        }




    }
}
