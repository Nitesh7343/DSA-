import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {1,5,4,6,78,32,3,4,5,0,1,2};
        // mergeSort(arr,0,arr.length-1);
        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // BubbleRec(arr,arr.length-1);
        System.out.println(Arrays.toString(selectionSort(arr)));
    }


    // Selection Sort
    public static int[] selectionSort(int[] nums) {
        for(int i = nums.length-1; i >= 0; i--) {
            int mx = max(nums,0,i);
            swap(nums,mx,i);
        }
        return nums;
    }
    public static int max(int nums[],int start , int end) {
        int max = start;
        for(int i = start;i<=end;i++) {
            if(nums[i] > nums[max]) max = i;
        }
        return max;  
    }
    public static void   swap(int[] nums , int idx1 , int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }


// Bubble Sort
    public static int[] bubbleSort(int[] nums) {
        boolean swapped;
        for(int i = 0; i < nums.length;i++) {
            swapped = false;
            for(int j = 1; j < nums.length-i;j++){
                if(nums[j] < nums[j-1]) {
                    swap(nums,j,j-1);
                    swapped = true;
                }
                
            }
            if(!swapped) break;
        }
        return nums;
    }


// Recursive Bubble sort
    public static void BubbleRec(int[] nums,int n) {
        if(n == 0) return;

        for(int i = 0; i < n;i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        BubbleRec(nums,n-1);
    }


// Insertion Sort
    public static void insertionSort(int[] nums) {
        for(int i = 1 ; i < nums.length;i++) {
            int j = i;
            while(j > 0 && nums[j] < nums[j-1]) {
               
                    swap(nums,j,j-1);
                    j--;
            }
        }
    }


// Merge sort
    public static void mergeSort(int[] nums , int start , int end) {
        if (start >= end) return;
        int mid = start + (end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    public static void merge(int[] nums,  int start, int mid , int end) {
        int[] merged = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <=end) {
            if(nums[i] <= nums[j]) {
                merged[k++] = nums[i++];
            }
            else merged[k++] = nums[j++];
        }

        while(i <= mid) {
            merged[k++] = nums[i++];
        }
        while(j <= end) {
            merged[k++] = nums[j++];
        }
        for(int x = 0; x < merged.length;x++){
            nums[start + x] = merged[x];
        }
    }


    
}
