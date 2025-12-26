import java.util.*;
public class oneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOneToN(n);
    }

    private static void printOneToN(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
        
    }
}
