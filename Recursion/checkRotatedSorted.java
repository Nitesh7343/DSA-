import java.util.*;
public class checkRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {6,10,6};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        int n = nums.length;
        int min = 0;
        for(int i = 0; i < n;i++) {
            if (nums[i] < nums[min]) min = i;
        }
        for(int i = min; i < n+min;i++) {
            if(nums[i%n] > nums[(i+1) % n]) return false;
        }
        return true;
    }
}
