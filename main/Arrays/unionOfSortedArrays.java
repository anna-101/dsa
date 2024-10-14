package Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class unionOfSortedArrays {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j =0;j<nums2.length;j++){
            set.add(nums2[j]);
        }

        int[] result = new int[set.size()];
        int k = 0;
        Iterator it = set.iterator();
        while(it.hasNext()){
            result[k++] = (Integer)it.next();
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr1  = {1,2,3,5,6,7};
        int[]  arr2 = {1,2,7,8,9};
        int[] r = unionArray(arr1,arr2);
        for(int i =0;i<r.length;i++){
            System.out.print(r[i] + ",");
        }

    }
}
