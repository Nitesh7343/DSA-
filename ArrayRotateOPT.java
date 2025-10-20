import java.util.*;
public class ArrayRotateOPT
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n;i++) 
        {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        while(start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        int k = sc.nextInt();
        k = k%n;
        start = 0;
        end = k-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = k;
        end = n-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num : arr) System.out.print(num + " ");
    }
}