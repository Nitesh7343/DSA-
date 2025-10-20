import java.util.*;
public class ArrayRotateMethod
{
    public static  void reverse(int[] arr,int start,int end) 
    {
        while(start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr,int k) 
    {
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n;i++) 
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr,k);
        
        for(int num : arr) System.out.print(num + " ");
    }
}