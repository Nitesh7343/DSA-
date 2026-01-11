package KK.StackQueue;

public class MainStack {
    public static void main(String[] args) throws Exception {
        CustomStack stk = new CustomStack();
        stk.push(10);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        stk.push(8);
        stk.push(9);
        stk.push(10);

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.pop());



    }
}
