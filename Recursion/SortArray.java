import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,5,9,3,4,2,6,2,8,9,1,0,2,32,0};
        sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr,int i) {
        if(i <= 1) return;
        sort(arr,i-1);
        insert(arr,i);
    }

    private static void insert(int[] arr, int i) {
        if(i == 0 || arr[i-1] <= arr[i]) return;

        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;

        insert(arr,i-1);


    }
}
