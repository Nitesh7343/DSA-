public class subsetString {
    public static void main(String[] args) {
        String str = "abc";
        printSubset("", str);
    }
    public static void printSubset(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        printSubset(p + ch, up.substring(1));
        printSubset(p, up.substring(1));
        
    }
}
