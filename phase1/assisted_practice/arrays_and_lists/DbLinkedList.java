package phase1.assisted_practice.arrays_and_lists;

public class DbLinkedList {
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    
    Node head, tail = null;  
      
    public void addNode(int data) {  
        Node newNode = new Node(data);  
  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        DbLinkedList dList = new DbLinkedList();  
        dList.addNode(10);  
        dList.addNode(20);  
        dList.addNode(30);  
        dList.addNode(40);  
        dList.addNode(50);  
  
        dList.display();  
    }
}