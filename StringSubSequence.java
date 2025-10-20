import java.util.*;
public class StringSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        s = s.toLowerCase();
        for(int i = s.length()-1;i >= 0 ;i--) {
            if(((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122) || ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57)) {
                s2 += s.charAt(i);
            }
        }
        int start = 0;
        int end = s2.length()-1;
        boolean c = true;
        System.out.println(s2);
        while(start < end){
            if(s2.charAt(start) != s2.charAt(end)) {
                System.out.println(s2.charAt(start));
                System.out.println(s2.charAt(end));
                c = false;
            }
            start++;
            end--;
        }
        System.out.println(c);
    }
}
