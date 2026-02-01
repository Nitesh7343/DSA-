import java.util.*;
public class StringSubSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> lst = subsqPowerSet(s); // without recursion (Power set).
        System.out.println(lst);
    }
    // without recursion (Power set).
    private static ArrayList<String> subsqPowerSet(String s) {
        ArrayList<String> lst = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i < Math.pow(2,n);i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < n;j++) {
                if((i & (1 << j)) != 0) {
                    sb.append(s.charAt(j));
                }
            }
            lst.add(sb.toString());
        }
        return lst;
    }
}
