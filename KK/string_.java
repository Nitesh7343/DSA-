import java.util.*;
public class string_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));
    }
    public static String check(String up) {
        if(up.isEmpty()) return "";
        char ch = up.charAt(0);
        return ch + check(up.substring(1));
    }
    
}
