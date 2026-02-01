import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(arr,0));
    }

    private static int sum(int[] nums, int i) {
        if(i == nums.length) return 0;

        return nums[i]+sum(nums,i+1);
    }
}
