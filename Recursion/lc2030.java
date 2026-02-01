import java.util.*;
public class lc2030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = smallestSubsequence("leet",3,'e',1);
        System.out.println(ans);
    }

    public static String smallestSubsequence(String s, int k, char letter, int r) {
        int n_letters = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == letter)
                n_letters ++;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (!stack.isEmpty()
                    && stack.peek() > c
                    && (s.length() - i + stack.size() > k)
                    && (stack.peek() != letter||n_letters > r)) {
                if (stack.pop() == letter) r ++;
            }
            if (stack.size() < k) {
                if (c == letter) {
                    stack.push(c);
                    r --;
                } else if (k - stack.size() > r) {
                    stack.push(c);
                }
            }
            if (c == letter) n_letters --;
        }
        StringBuilder sb = new StringBuilder(stack.size());
        for(Character c : stack) sb.append(c);
        return sb.toString();


    }
}

