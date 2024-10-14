package Arrays;

public class rotateArrayByRight {
    public static void rotateArrayLeft(int[] nums, int shift) {
        int pos = shift;
        int j = 0;
        int[] temp = new int[pos];
        for(int k = 0; k<temp.length; k++){
            temp[k] = nums[k];
        }
        for(int i = pos; i<nums.length;i++){
            nums[j] = nums[i];
            j++;
        }
        for(int i = 0;i<temp.length;i++){
            nums[j] = temp[i];
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int shift = 2;
        rotateArrayLeft(arr,shift);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
