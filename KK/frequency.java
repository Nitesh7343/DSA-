import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i =0;i<n;i++) arr[i]= sc.nextInt();
        System.out.println(countFrequencies(arr));

        
    }
    public static List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        int i = 0;
        List<List<Integer>> lst = new ArrayList<>();
        for(int num : map.keySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(num);
            temp.add(map.get(num));
            lst.add(temp);
        }
        return lst;
    }
}
