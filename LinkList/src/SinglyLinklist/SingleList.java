public static class SingleList {
    static class Node{
        int data;
        Node next;
        //Constructor
        Node(int data){
            this.data =  data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    //Constructor
    public SingleList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //======================
    //   INSERTION
    //======================

    //Insert at beginning
    public void insertAtHead(int data) {
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

    //Insert atv ending
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //Insert in position
    public void insertAtPosition(int index, int data) {
        Node newNode = new Node(data);

        if (index < 1 || index > size + 1) {
            System.out.println("Invalid index");
            return;
        }
        if (index == size + 1) {
            insertAtTail(data);
            return;
        }
        if (index == 1) {
            insertAtHead(data);
            return;
        }

        //middle mai kahi insert krna hai to
        Node prevNode = head;
        for (int i = 1; i <= index - 2; i++) {
            prevNode = prevNode.next;

        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;

    }

    //=====================
    // Traversal
    //=====================

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }


    //==================
    //UTILITY FUNCTION
    //==================

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){

        return head == null;
    }

    public int getHead(){
        if(head == null){
            return -1;
        }else{
            return head.data;
        }
    }

    public int getTail(){
        if(tail == null){
            return -1;
        }else{
            return tail.data;
        }
    }

    //================
    // SEARCHING
    //===============

    //if value is present or not
    public boolean search(int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }else{
                temp = temp.next;
            }
        }
        return  false;
    }

    // find the position
    public int findPosition(int target){
        Node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.data == target){
                return position;
            }else{
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }

    //===========
    // Updation
    //============

    //update using position

    public void updatePosition(int position,int newData){
        if(position < 1 || position > size + 1){
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;
        for(int i = 1; i <= position-1; i++){
            temp = temp.next;
        }
        temp.data = newData;
    }

    //first occurrence of the value

    public boolean updateValue(int oldData,int newData){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldData){
                temp.data = newData;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

//=======================
// DELETION
// ======================

    //delete head
public void deleteHead(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
}
   //delete tail
public void deleteTail(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
        }

        Node temp = head;
        for(int i = 1; i <= size-2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }


}
public static void main(String[] args) {
    SingleList myList = new SingleList();
    if(myList.isEmpty()){
        System.out.println("Empty List");
    }
    System.out.println("get size of list "+myList.getSize());

    myList.insertAtHead(1);
    myList.printList();

    myList.insertAtHead(2);
    myList.printList();

    myList.insertAtHead(3);
    myList.printList();

    myList.insertAtTail(10);
    myList.printList();

    myList.insertAtTail(20);
    myList.printList();

    myList.insertAtTail(30);
    myList.printList();

    myList.insertAtPosition(1, 4);
    myList.printList();

    myList.insertAtPosition(8, 40);
    myList.printList();

    myList.insertAtPosition(5, 121);
    myList.printList();
    System.out.println( "tail of the list: " +myList.getTail());
    System.out.println("head of the list: " +myList.getHead());

    System.out.println("found or not :" +myList.search(20));

    System.out.println("position :" +  myList.findPosition(20));

    myList.updatePosition(4, 300);
    myList.printList();

    myList.updateValue(300, 4);
    myList.printList();

    myList.deleteHead();
    myList.printList();

    myList.deleteHead();
    myList.printList();

    myList.deleteTail();
    myList.printList();





}
