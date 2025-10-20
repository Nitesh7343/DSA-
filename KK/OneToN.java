import java.util.*;
public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        PrintNo(n);
        PrintNo1(n);
    }
    // print n to 1
    static void PrintNo(int n) {
        System.out.println(n);
        if(n == 1) return;
        PrintNo(n-1);
    }

    // print 1 to n 
    static void PrintNo1(int n) {
        PrintNo(n-1);
        System.out.println(n);
        if(n == 1) return;
    }
}
