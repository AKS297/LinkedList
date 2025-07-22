package org.example;

public class IterateLinkedList {

    public void iterateList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
