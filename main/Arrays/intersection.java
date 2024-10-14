package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersection {
    public static List<Integer> intersectionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for(int i = 0;i<n;i++){
            set.add(nums1[i]);
        }
        while(j < m){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args){
        int[] ar1 = {1,2,3,6,7};
        int[] ar2 = {1,2,5,6,7};
        List<Integer> a = intersectionArray(ar1,ar2);
        for(int i =0;i<a.size();i++){
            System.out.print(a.get(i) + ",");
        }
    }
}
