package org.example;

public class RemoveHead {

    public void removeHead(Node head){
        head = head.next;
        System.out.println(head.data + " Replaced Head ");
    }

    public Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
