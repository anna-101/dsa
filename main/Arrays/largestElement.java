package Arrays;

public class largestElement {

        public static int largestElement(int[] nums) {
            int largest =nums[0];
            for(int i = 0;i<nums.length;i++){
                largest = Math.max(largest, nums[i]);
            }
            return largest;
        }

    public static void main(String[] args) {
        int[] arr = {2, 10, 3, 4, 5, 6, 6};
        System.out.println(largestElement(arr));
    }
}
