import java.lang.reflect.Array;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(linearSearchAll(arr, target, 0,result));
    }

    private static int linearSearch(int[] arr, int target, int i) {
        if(i == arr.length) return -1;
        return arr[i] == target ? i : linearSearch(arr, target, i+1);
    }

    private static ArrayList linearSearchAll(int[] arr, int target, int i,ArrayList<Integer> result) {
        if(i == arr.length) return result;
        if(arr[i] == target) result.add(i);
        return linearSearchAll(arr, target, i+1,result);
        
    }
// if you what to return new arraylist instead of passing as argument  
    // static ArrayList linearSearchAll(int[] arr, int target, int i) {
    //     ArrayList<Integer> result = new ArrayList<>();
    //     if(i == arr.length) return result;

    //     // this will contains answer for that function call only. 
    //     if(arr[i] == target) result.add(i);

    //     ArrayList<Integer> ansFromBelowCalls = linearSearchAll(arr, target, i+1);

    //     result.addAll(ansFromBelowCalls);
    //     return result;
        
    // }
}
