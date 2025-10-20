import java.util.*;
public class BinarySearch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while(i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        int target = sc.nextInt();
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
        //Binary Search

        static int binarySearch(int[] nums,int target) {
            Arrays.sort(nums);
            int start = 0;
        int end = nums.length-1;
        boolean isAsc = nums[start] <= nums[end];
        while(start <= end) {
            int mid = start + (end-start)/2; //(start + end)/2;

            if(isAsc) {
                if(nums[mid] > target) {
                    end = mid - 1;
                }
                else if(nums[mid] < target) {
                    start = mid +1;
                }
                else return mid;
            }
            else {
                if(nums[mid] < target) {
                    end = mid - 1;
                }
                else if(nums[mid] > target) {
                    start = mid +1;
                }
                else return mid;
            }
        }
        return end;
    }
}
