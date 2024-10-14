package Arrays;

import java.util.ArrayList;
import java.util.List;

public class addTwoNumsInArray {

    public static void addTwoArrays(int[] a, int[] b){
        int add;
        int sum;
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        if(a.length ==0 && b.length ==0) return;

        if(a.length == 0 | b.length==0) {
            return;
        }
        int i = n-1;int j = m-1;
        // a = {1,2,3} , b ={2,3}
            while(i >=0 && j >=0){
                a[i] += carry;
                add = a[i--] + b[j--];
                sum = add % 10;
                carry = add / 10;
                list.add(0,sum);
            }
        while(i >=0){
            list.add(0,a[i--]);
        }
        while(j >=0){
            list.add(0,b[j--]);
        }
        for(int k : list){
            System.out.print(k);
        }
    }

    public static void main(String[] args){
        int[] a = {1,2,3,8,9};
        int [] b = {2,6,7,8};
        addTwoArrays(a,b);
    }
}
