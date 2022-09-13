package One;

import java.util.Arrays;
import java.util.Collections;

public class Five {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 0, -5, 2, 6, -5, 2};
        System.out.println(Arrays.toString(findBorders(array)));
    }
    public static int[] findBorders(int [] array){
        int ans = array[0], ans_l = 0, ans_r = 0, sum = 0, minus_pos = -1;
        for (int r = 0; r < array.length; ++r){
            sum += array[r];
            if (sum > ans){
                ans = sum;
                ans_l = minus_pos + 1;
                ans_r = r;
            }
            if (sum < 0){
                sum = 0;
                minus_pos = r;
            }
        }
        return new  int [] {ans_l, ans_r};
    }
}
