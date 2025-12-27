package KK.LinkedList.com.LinkedList;

public class DLL {
    Node head;
    Node tail;
    int size;

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!= null) {
            head.prev = node;
        }
        head = node;

        if(tail == null) tail = head;
        size++;
    }

    public void addLast(int val) {
        if(head == null) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        tail = node;

        size++;
    }

    public void insert(int val,int index) {
        Node temp = head;
        for(int i = 0 ; i < index;i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null){
            node.next.prev = node;
        }
        else tail = node;
//        Node node = new Node(temp,val,temp.next);
//        temp.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }


    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node prev, int val, Node next) {
            this.prev = prev;
            this.val = val;
            this.next = next;
        }
    }
}
