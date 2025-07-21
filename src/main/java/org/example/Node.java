package org.example;

public class Node {
    public int data;
    public Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data = data;
    }

    public Node(){

    }

    public Node convertToLinkedList(int [] arr){
        //Create First Node or Head
        Node head = new Node(arr[0]);
        //Assign first element as head and Just Move the Mover to next element
        Node mover = head;

        for(int i = 1; i < arr.length;i++){
            Node temp = new Node(arr[i]);
            //Assign the Element address of Next element
            mover.next = temp;
            //Move the mover to next element
            mover = temp;
        }

        return head;
    }
}
