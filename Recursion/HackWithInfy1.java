import java.util.*;
public class HackWithInfy1 {
    public static void main(String[] args) {
        int n = 10;
        int cnt = 1;
        while(n >= 10) {
            n = beautiful(n);
            cnt++;
        }
        System.out.println(cnt+8);
    }
    public static int beautiful(int n) {
        if(n%10 != 0) n++;
        while(n%10 == 0) n /= 10;
        return n;
    }
}
