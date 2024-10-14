package Arrays;

import java.util.PriorityQueue;

public class secondLargest {

    public static int secondLargestElement(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<nums.length;i++) {
            pq.add(nums[i]);
            if (pq.size()>2)
                pq.remove();
            }

        return pq.peek();
    }


public static void main(String[] args) {
    int[] arr = {9, 9, 9, 9, 8, 9};
    System.out.println(secondLargestElement(arr));
}
}
