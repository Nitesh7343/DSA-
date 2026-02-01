import java.util.Scanner;

public class NToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    static int i = 1;
    private static void print(int n) {
        if(n == 0) return;

        System.out.println(i++);
        print(n-1);
        return;
    }
}
