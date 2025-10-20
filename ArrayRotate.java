import java.util.*;
public class ArrayRotate
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++) 
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        int j = 0;
        while(j < k) 
        {
            int temp = arr[n-1];
            for(int i =0;i<n-1;i++)
            {
                arr[n-1-i] = arr[n-2-i];
            }
            arr[0] = temp;
            j++;
        }
        for(int num : arr) 
        {
             System.out.print(num + " ");
        }
    }
}