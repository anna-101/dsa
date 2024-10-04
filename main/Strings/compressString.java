package Strings;

public class compressString {
    public static void main(String[] args) {
        char[] chars = {'a', 'b','b', 'b', 'b','b','b','b','b','b','b', 'b','b','b','b','b','c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int start = 0;
        int end = 0;
        int k = 0;
        int count;
        while(start<chars.length){
            start = end;
            while(end < chars.length && chars[start] == chars[end]){
                end++;
            }
            chars[k++] = chars[start];
            count = end - start;
            if (count >=2 ) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[k++] = c;
                }
            }
            start = end;
        }
        for(int i = 0;i<k;i++){
            System.out.print(chars[i] + ",");
        }
        System.out.println();
        return k;
    }
}
