import java.util.*;
public class reverseN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(pow(n));
    }


    static int pow(int n) {
        int digits = (int)Math.log10(n) +1;
        return reverse(n , digits);
    }
    static int reverse(int n , int digits) {
        if(n/10 == 0) return n;
        return (n%10)*(int)Math.pow(10 , digits-1) + reverse(n/10,digits-1);
        }
}
