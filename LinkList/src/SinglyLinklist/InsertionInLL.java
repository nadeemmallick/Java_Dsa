package SinglyLinklist;

public class InsertionInLL {
    static class Node {
        int data;
        Node next;



        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public InsertionInLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //INSERT AT HEAD

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        //always increase the size when add new node
        size++;
    }

    public static void  main(String[] args) {
        InsertionInLL myList= new InsertionInLL();
        if(myList.isEmpty()){
            System.out.println("Empty List");
        }
        System.out.println("get size of list "+myList.getSize());

        myList.insertAtHead(1);
    }


}
