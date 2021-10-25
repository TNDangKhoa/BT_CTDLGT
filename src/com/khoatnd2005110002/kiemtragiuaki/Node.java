package com.khoatnd2005110002.kiemtragiuaki;

public class Node {
    int data;

    Node next;

    public Node(){}

    public Node(int d){
        data = d;
        next = null;
    }

    public Node (int d, Node n){
        data = d;
        next = n;
    }
}