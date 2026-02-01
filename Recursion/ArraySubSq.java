import java.util.*;
public class ArraySubSq {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,2};
//        ArrayList<ArrayList<Integer>> lst = subsqPowerSet(arr);  // without recursion (Power set).
//        System.out.println(lst);
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
//        subsqRec(0,new ArrayList<Integer>(),lst,arr);
        int k = 4;
        subsqRecSum(0,new ArrayList<Integer>(),lst,arr,0,k);
        System.out.println(lst);
    }

    private static void subsqRecSum(int i, ArrayList<Integer> lst, ArrayList<ArrayList<Integer>> ans, int[] nums,int sum , int k) {
        if(i >= nums.length) {
            if(sum == k)ans.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[i]);
        sum += nums[i];
        subsqRecSum(i+1,lst,ans,nums,sum,k);
        lst.remove(lst.size()-1);
        sum -= nums[i];
        subsqRecSum(i+1,lst,ans,nums,sum,k);
    }

    //recursion
    private static void subsqRec(int i, ArrayList<Integer> lst, ArrayList<ArrayList<Integer>> ans, int[] nums) {
        if(i >= nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[i]);
        subsqRec(i+1,lst,ans,nums);
        lst.remove(lst.size()-1);
        subsqRec(i+1,lst,ans,nums);
    }


    // without recursion (Power set).
    private static ArrayList<ArrayList<Integer>> subsqPowerSet(int[] nums) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        for(int i = 0; i < Math.pow(2,nums.length);i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j < nums.length;j++) {
                if((i & (1 << j)) != 0) {
                    temp.add(nums[j]);
                }
            }
            lst.add(temp);
        }
        return lst;
    }
}
