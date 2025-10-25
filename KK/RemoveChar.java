import java.util.*;
public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        // String result = removeChar(str, ch, 0, "");
        String result = removeChar(str);
        System.out.println(result);
    }

    // static String removeChar(String str, char ch, int idx, String newStr) {
    //     if(idx == str.length()) return newStr;
    //     if(Character.toLowerCase(str.charAt(idx)) == ch) {
    //         return removeChar(str, ch, idx+1, newStr);
    //     }
    //     else {
    //         newStr += str.charAt(idx);
    //         return removeChar(str, ch, idx+1, newStr);
    //     }
    // }

    // static String removeChar(String str , char ch,int idx) { 
    //     if(idx == str.length()) return "";
    //     if(Character.toLowerCase(str.charAt(idx)) == ch) {
    //         return removeChar(str, ch, idx+1);
    //     }
    //     else {
    //         return str.charAt(idx) + removeChar(str, ch, idx+1);
    //     }
    // }

    static String removeChar(String str) {
        if(str.isEmpty()) return "";
        char ch = str.charAt(0);
        if(ch == 'a' || ch == 'A') {
            return removeChar(str.substring(1));
        }
        else {
            return ch + removeChar(str.substring(1));
        }
    }
}
