package com.upgrad.oop3;


public class TestDemo {
    static Node head;

    static class Node{
        int value;
        Node next;

        public Node(int data){
            this.value = data;
            next = null;
        }
    }

    public static void main(String[] args){
        head = new Node(20);
        //head.next = new Node(30);
        addAtGivenIndex(34,7);
        addAtGivenIndex(32,2);
        addAtGivenIndex(24,3);
        addAtGivenIndex(22,5);
        addAtGivenIndex(21,5);
        addAtGivenIndex(29,0);
        addAtGivenIndex(79,5);
        addAtGivenIndex(94,7);
        addAtGivenIndex(92,1);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static void addAtGivenIndex(int k, int index) {
        // Write your code here
        if(head == null){
            head = new Node(k);
            return;
        }

        if(index == 0){
            Node cur = new Node(k);
            cur.next = head;
            head = cur;
            return;
        }

        Node temp = head;
        Node next;
        Node prev=head;
        int i = 0;
        while(temp != null){
            if(i == index-1){
                next = temp.next;
                temp.next = new Node(k);
                temp.next.next = next;
                return;
            }
            i++;
            prev = temp;
            temp = temp.next;
        }
        prev.next = new Node(k);
    }

}
