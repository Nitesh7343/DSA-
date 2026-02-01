import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        int n = arr.length;
        reverse(arr,0,n-1); // two parameter.
//        reverse(arr,0); //one parameter.
        System.out.println(Arrays.toString(arr));
    }

    //two parameter
    private static void reverse(int[] arr,int i,int j) {
        if(i >= j) return;
        swap(arr,i,j);
//        reverse(arr,i+1,j-1);
        reverse(arr,++i,--j);
        return;
    }

    //one parameter
//    private static void reverse(int[] arr,int i) {
//        if(i > arr.length/2) return;
//        swap(arr,i,arr.length-i-1);
////        reverse(arr,i+1);
//        reverse(arr,++i);
//        return;
//    }

    private static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
