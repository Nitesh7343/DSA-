import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
//        String s = "Hello Java avaJ olleH";
//        String s = "My name is yM";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(palindrome(s)) System.out.println("Yes,String is Palindomre");
        else System.out.println("No,String is not Palindrome");
    }

    private static boolean palindrome(String s) {
        if(s.length() <= 1) return true;
        if(s.charAt(0) == s.charAt(s.length()-1)) return palindrome(s.substring(1,s.length()-1));
        else return false;
    }
}
