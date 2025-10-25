import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaderArrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while(i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println(leaders(arr));
    }
// have to check again .. and reverse the answer list.
    public static List<Integer> leaders(int[] nums) {
        int largest = Integer.MIN_VALUE;
        List<Integer> lst = new ArrayList<>();
        for(int i = nums.length-1;i>=0;i--) {
            if(nums[i] > largest) {
                largest = nums[i];
                lst.add(largest);
            }
        }
        return lst;
    }
}
