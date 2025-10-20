import java.util.*;
public class PascalTri 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.add(new ArrayList<>());
        lst.get(0).add(1);
        lst.get(1).add(1);
        lst.get(1).add(1);
        for(int i =2;i<n;i++) {
            List<Integer> pre = lst.get(i-1);
            lst.add(new ArrayList<>());
            lst.get(i).add(1);
            for(int j = 0; j < i-1;j++) {
                int s = pre.get(j) + pre.get(j+1);
                lst.get(i).add(s);
            }


        }
        System.out.println(lst);
    }
}
