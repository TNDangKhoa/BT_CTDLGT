package bttrenlop.Tuan7;

public class LinkedList {
    
    Node head = null;
    Node tail = null;

    public LinkedList(){}
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void print(){
        Node current = head;

        if(head == null){
            System.out.println("DS Rỗng");
            return;
        }

        System.out.println("Các nút trong DS: ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
