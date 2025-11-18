import java.util.*;
class rotate90Matrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    rotate(mat,n);
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        System.out.print(mat[i][j]);
      }
      System.out.println();
    }
  }
  public static void rotate(int[][] mat,int n) {
    for(int i = 0; i < n-1;i++) {
      for(int j = i+1;j<n;j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }

    for(int i = 0; i < n; i++) {
        reverse(mat[i]);
    }
  }

  public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}