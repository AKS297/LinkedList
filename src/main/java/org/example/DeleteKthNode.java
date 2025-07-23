package org.example;

public class DeleteKthNode {

    public Node deleteElement(Node head,int k){
        if(head == null){
            return null;
        }
        if(k == 1){
            Node temp = head;
            head = temp.next;
            return head;
        }
      Node temp = head;  Node prev = null; int count = 0;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

}
