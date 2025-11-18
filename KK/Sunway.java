public class Sunway {
    public static void main(String[] args) {
        String s = "Sunway";
        int i = 0;
        while(s.charAt(i) != 'n') i++;
        s = s.substring(0,i) + "b" + s.substring(i+1,s.length());
        System.out.println(s);
    }
}
