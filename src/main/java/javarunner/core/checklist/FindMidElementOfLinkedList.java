package javarunner.core.checklist;

public class FindMidElementOfLinkedList {

   static class Nodes
    {
        int num;
        Nodes next;

        // constructor of the class Node
        Nodes(int n)
        {
            this.num = n;
            this.next = null;
        }
    }
   public static class OnePointerExample1 {
        // a method to find the size of the linked list
        public int size(Nodes h) {
            int sz = 0;
            while (h != null) {
                sz = sz + 1;
                h = h.next;
            }
            return sz;
        }
        public void findNode(Nodes n) {
            Nodes h = n;
    // invoking the method size() to find the size of the linked list
            int s = size(n);
    // dividing the size by 2
            s = s / 2;

            while (s != 0) {
                // moving h to the next node
                h = h.next;
                s = s - 1;
            }
            // the value of the node pointed by the node h
            int val = h.num;
            System.out.println("The middle node of the linked list is: " + val);
        }
    }

    public static void main(String[] args) {
// head node of the linked list
        Nodes h = new Nodes(13);

// remaining node of the linked list
        h.next = new Nodes(17);
        h.next.next = new Nodes(90);
        h.next.next.next = new Nodes(76);
        h.next.next.next.next = new Nodes(45);
        h.next.next.next.next.next = new Nodes(32);
        h.next.next.next.next.next.next = new Nodes(10);

// creating an object of the class OnePointerExample1
        OnePointerExample1 obj = new OnePointerExample1();

// invoking the method findNode()
        obj.findNode(h);

    }


}
