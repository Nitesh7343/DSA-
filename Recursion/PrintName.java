import java.util.*;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = 5;
        print(name, n);
    }

    private static void print(String s, int n) {
        if(n == 0) return;

        System.out.println(s);
        print(s,n-1);
        return;
    }
}
