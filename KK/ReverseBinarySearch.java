import java.util.*;
public class ReverseBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;) {
            arr[i++] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = BinarySearch(arr, target);
        System.out.println(ans);

    }

    public static int BinarySearch(int[] arr,int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]) {
            int temp = end+1; 
            end = end + (end-start + 1) *2;
            start = temp;
        }
        while(start < end) {
            int mid = start + (end-start)/2; 
            if(arr[mid] > target) {
                    end = mid - 1;
                }
                else if(arr[mid] < target) {
                    start = mid +1;
                }
                else return mid;
        }
        return start;
    }
}
