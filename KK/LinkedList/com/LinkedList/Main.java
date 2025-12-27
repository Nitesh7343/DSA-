package KK.LinkedList.com.LinkedList;

public class Main extends LL {
    public static void main(String[] args) {
        //Singly LinkedList
//        LL lst = new LL();
//        lst.addFirst(23);
//        lst.addFirst(1);
//        lst.addLast(0);
//        lst.addLast(1);
//        lst.insert(99,3);
//        lst.display();
//        System.out.println("Size = " + lst.getSize());
//        System.out.println(lst.delete(1));
//
//        lst.display();
//        System.out.println("Size = " + lst.getSize());


        //Doubly LinkedList

        DLL lst1 = new DLL();
        lst1.addFirst(23);
        lst1.addFirst(3);
        lst1.addFirst(2);
        lst1.addLast(203);
        lst1.addLast(0);
        lst1.display();
        lst1.insert(50,4);
        lst1.display();
        lst1.displayReverse();
    }
}
