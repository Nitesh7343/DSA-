import java.util.*;
class CeilingOfNumber {
    public static void main(string_[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Ceil(target, arr)+","+Floor(target, arr));
    }
    static int Ceil(int target, int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > target) end = mid-1;
            else if(nums[mid] < target) start = mid+1;
            else return nums[mid];
        }
        return nums[start];
    }

    static int Floor(int target,int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > target) end = mid-1;
            else if(nums[mid] < target) start = mid+1;
            else return nums[mid];
        }
        return nums[end];
    }
}