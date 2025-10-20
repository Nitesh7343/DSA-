import java.util.*;
public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        int l = s.length();
        if(l % 3 == 0) {
            s1 = s.substring(0,l/3);
            s2 = s.substring(l/3,l - l/3);
            s3 = s.substring(l-l/3);
        }
        else if(l % 3 == 1) {
            s1 = s.substring(0,l/3 );
            s2 = s.substring(l/3,l - l/3);
            s3 = s.substring(l-l/3);
        }
        else {
            s1 = s.substring(0 , l/3);
            s2 = s.substring(l/3,l/3 + 1);
            s3 = s.substring(l/31);
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
