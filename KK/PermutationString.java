import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PermutationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(permute("",str));
    }
    public static ArrayList<String> permute(String p , String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length();i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permute(f + ch + s , up.substring(1)));
        }

        return ans;
    }
}
