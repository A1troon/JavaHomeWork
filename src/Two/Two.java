package Two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Two {
    public static void main(String[] args) {
        try {


            int array[] = new int[]{1, 5, 7, 8, 11, 35, 26, 63, 12, 66, 22, 2, 6};
            List<Integer> result = findElementsWithSum(array, 77);
            for (int i = 0; i < result.size(); ++i) {
                System.out.println(result.get(i));
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("не найдено");
        }
    }
    private static ArrayList<Integer> findElementsWithSum(int[] array, int sum){

        boolean[] isUsing = new boolean[array.length];
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(true) {
            int permutationSum = 0;
            for (int i = 0; i < array.length; ++i)
                permutationSum += array[i] * (isUsing[i] ? 1 : 0);
            if (permutationSum == sum)
                break;
            else
                nextPermutation(isUsing);
        }
        for(int i = 0; i < isUsing.length; ++i)
            if(isUsing[i])
                result.add(array[i]);
        return result;

    }
    private static void nextPermutation(boolean[] array){
        for(int i = 0; i < array.length; ++i){
            if(array[i] == false) {
                array[i] = true;
                break;
            }
            else {
                while(array[i] == true)
                    array[i++] = false;
                array[i] = true;
                break;
            }
        }
    }
}
