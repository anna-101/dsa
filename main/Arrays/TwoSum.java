package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] indices  = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){

                return new int[]{map.get(target - nums[i]), i};
            }
            else{
                map.put(nums[i],1);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] arr = {1, 6, 2, 10, 3};
        int sum = 7;
        int[] indexes = twoSum(arr,sum);

        System.out.println(indexes[0] + " , ");
        System.out.println(indexes[1]);
    }
}
