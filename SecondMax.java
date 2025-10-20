import java.util.*;
class SecondMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            if(max < arr[i]) 
            {
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && smax != max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
     }
}