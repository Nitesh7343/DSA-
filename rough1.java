import java.util.*;
class rough1 {
    ////Reverse and rotation........................................................
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i< n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         rotate(arr,0,n-1);
//         rotate(arr,0,k-1);
//         rotate(arr,k,n-1);
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
//     static void rotate(int[] nums,int start,int end) {
//         while(start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }

    //// minimum and maximum of array...................................................
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int num : MinMax(arr)) {
            System.out.print(num + " ");
        }
    }
    static int[] MinMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        return new int[]{max,min};
    }

//// reverse integer.................................................................@Test
// public void test() {
    
// }    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = 0;
//         while(n > 0) {
//             int rem = n%10;
//             ans = ans*10 + rem;
//             n = n/10;

//         }
//         System.out.println(ans);
//     }

// //......................................................sorted..............
// public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             for(int i = 0; i< n; i++) {
//                 arr[i] = sc.nextInt();
//             }
//             System.out.println(Sorted(arr));
// }
// static boolean Sorted(int[] nums) {
//     if(nums[0] < nums[nums.length-1]) {
//         for(int i =1; i < nums.length;i++) {
//             if(nums[i] < nums[i-1]) return false;
//         }
//     }
//     else if(nums[0] > nums[nums.length-1]) {
//         for(int i =1; i < nums.length;i++) {
//             if(nums[i] > nums[i-1]) return false;
//         }
// }
// return true;
// }

// ....................Second largest...................................................
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int[] arr = new int[n];
        //     for(int i = 0; i< n;i++) arr[i] = sc.nextInt();
        //     System.out.println(SecondLargest(arr));
        // }

        // static int SecondLargest(int[] nums) {
        //     int max = Integer.MIN_VALUE;
        //     int smax = Integer.MIN_VALUE;
        //     for(int num : nums){
        //         if(max < num) {
        //             smax = max;
        //             max = num;
        //         }
        //         else if(num > smax && smax != max) smax = num;
        //     }
        //     return smax;
            
        // }


        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int[] arr = new int[n];
        //     for(int i = 0; i< n;i++) arr[i] = sc.nextInt();
        //     int k = sc.nextInt();
        //     System.out.println(BinarySearch(arr, k));
        // }

        // static int BinarySearch(int[] nums,int target) {
        //     int start = 0;
        //     int end = nums.length-1;
        //     while(start <= end) {
        //         int mid = start + (end - start)/2;
        //         if(nums[mid] > target) end = mid-1;
        //         else if(nums[mid] < target) start = mid+1;
        //         else return mid;
        //     }
        //     return -1;
        // }


        //// ......................................binary search........................
        /// // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int[] arr = new int[n];
        //     for(int i = 0;i<n;i++) {
        //         arr[i] = sc.nextInt();
        //     }
        // }

        // static int StartEnd(int[] nums) {
        //     Arrays.sort(nums);
        //     int count = 0;
        //     for(int i = 1;i<nums.length;i++) {
        //         int tcount = 0;
        //         while(nums[i] == nums[i-1]) {
        //             tcount++;
        //         }
        //         count = Math.max(count,tcount);
        //     }
            
        //     return count;
        // }

        
            // public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // int[] arr = new int[n];
            // for(int i =0;i<n;i++) {
            //     arr[i] = sc.nextInt();
            // }
            // for(int i = 0;i< n ;i++) {
                
            // }
            // }

        

        

}