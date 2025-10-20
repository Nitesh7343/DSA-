import java.util.*;
public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr,int i) {
        if(i == arr.length-1) return true;
        // if(arr[i] > arr[i+1]) return false;
        // return isSorted(arr, i+1);
        return arr[i] <= arr[i+1] && isSorted(arr,i+1);
    }
}
