package KK.LinkedList;

public class Main extends CustomLL{
    public static void main(String[] args) {
        CustomLL lst = new CustomLL();
        lst.addFirst(23);
        lst.addFirst(1);
        lst.addLast(0);
        lst.addLast(1);
        lst.insert(99,3);
        lst.display();
        System.out.println("Size = " + lst.getSize());
        System.out.println(lst.delete(1));

        lst.display();
        System.out.println("Size = " + lst.getSize());

    }
}
