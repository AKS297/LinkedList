package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int [] arr = {1,2,3,4,5};
      Node node = new Node();
     Node head = node.convertToLinkedList(arr);

     IterateLinkedList list = new IterateLinkedList();
     list.iterateList(head);

     RemoveHead removeHead = new RemoveHead();
     removeHead.removeHead(head);

      //
    }
}