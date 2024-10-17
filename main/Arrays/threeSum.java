package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// returns sub array of triplets of sum 0
public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;
        int sum;
        int i = 1;
        while (i < nums.length - 1) {
            sum = nums[i - 1] + nums[i] + nums[i + 1];
            if (sum == 0) {
                result.add(Arrays.asList(nums[i - 1],
                        nums[i],
                        nums[i + 1]));
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        int[] a = {-1,0,1,2,2,-4};
        List<List<Integer>> list = new ArrayList<>();
        list = threeSum(a);
        for(List i : list){
            System.out.print(i);
        }
    }
}

