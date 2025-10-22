import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n,0);
    }
    // static void pattern1(int n) {
    //     for(int i = 0; i < n ; i++) {
    //         for(int j = 0; j < n-i;j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    static void pattern1(int r,int c) {
        if(r == 0) return;
        if(c < r) {
            System.out.print("*");
            pattern1(r,c+1);
        }
        else{
        System.out.println();
        pattern1(r-1,0);
        }
    }
}
