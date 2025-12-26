import java.util.*;
public class Temp {
    public static void main(String[] args) {
        int[] arr= {8,6,11,12,5,10,2,9};
        for(int i=0 ; i <= 3;i++) {
            for(int j = 0; j < arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;   
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
