package KK.LinkedList.com.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void addLast(int val) {
        if(tail == null) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val,int index) {
        if(index == 0) {
            addFirst(val);
            return;
        }
        if(index == size) {
            addLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index;i++) {
            temp = temp.next;
        }
//        Node node = new Node(val);
//        Node temp2 = temp.next;
//        temp.next = node;
//        node.next = temp2;
        Node node = new Node(val,temp.next);
        temp.next = node;

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

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return val;
    }

    public int deleteLast() {
        if(head == tail) return deleteFirst();
        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        int value = tail.val;
        tail = temp;
        tail.next = null;
        size--;
        return value;
    }
    public int delete(int index) {
        if(index == 0) return deleteFirst();
        if(index == size) return deleteLast();

        Node temp = head;
        for(int i = 1; i < index;i++) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public int getSize() {
        return size;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
