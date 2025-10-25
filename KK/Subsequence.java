import java.lang.reflect.Array;
import java.util.*;
public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(subsequence("", str));
        // ArrayList<String> ans= new ArrayList<>();
        // subsequence("", str,ans);
        // System.out.println(ans);
    }

    // static void subsequence(String p , String u, ArrayList<String> ans) {
    //     if(u.isEmpty()){
    //         ans.add(p);
    //         return;
    //     }
    //     char ch = u.charAt(0);
    //     subsequence(p, u.substring(1),ans);
    //     subsequence(p + ch, u.substring(1),ans);
    // }

     static ArrayList<String> subsequence(String p , String u) {
        ArrayList<String> lst= new ArrayList<>();
        if(u.isEmpty()){
            lst.add(p);
            return lst;
        }
        char ch = u.charAt(0);
        lst.addAll(subsequence(p, u.substring(1)));
        lst.addAll(subsequence(p + ch, u.substring(1)));
        return lst;
    }
}
