package com.khoatnd2005110002.kiemtragiuaki;

public class AppleLinkedList {
    Node head = null;
    Node tail = null;
    
    public AppleLinkedList(){}

    void add() {
        Node newNode = new Node(){
            
        };
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next =newNode;
            tail = newNode;
        }
    }
}
