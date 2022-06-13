package javarunner.core.checklist;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("M");
        linkedList.add("H");
        linkedList.add("C");
        linkedList.add("P");
        linkedList.addLast("Z");

        linkedList.add("D");
        linkedList.add("K");
        System.out.println(linkedList);
        //linkedList.remove("C");
   /*     linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("peek first: "+linkedList.peekFirst());
        System.out.println("pop first: "+linkedList.pop());
        System.out.println("poll first: "+linkedList.pollFirst());
        linkedList.push("A");
        System.out.println(linkedList);*/

    }
}
