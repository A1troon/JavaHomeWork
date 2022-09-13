package One;

import java.util.Arrays;
import java.util.Iterator;

public class Six
{
    public static void main(String [] args)
    {
        int[] array = new int[]{1, 3, 5, 7 ,7 ,7, 8, 15};
        int[] array2 = new int[]{1, 6, 15, 25, 30};
        int[] array3 = new int[]{1, 1, 1 , 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sort(array, array2, array3)));
    }

    private static int[] sort(int [] first, int [] second, int [] third)
    {
        int index1, index2, index3;
        index1 = index2 = index3 = 0;

        int [] resultArray = new int[first.length+second.length+third.length];
        for(int i = 0, elem1 = first[index1], elem2 = second[index2], elem3 = third[index3]; i < resultArray.length; ++i)
        {
            int minElem = Math.min(Math.min(elem1, elem2),elem3);
            if(elem1 == minElem)
            {
                resultArray[i] = minElem; ++index1; elem1 = index1 < first.length ? first[index1] : Integer.MAX_VALUE;
            }
            else if(elem2 == minElem)
            {
                resultArray[i] = minElem; ++index2; elem2 = index2 < second.length ? second[index2] : Integer.MAX_VALUE;
            }
            else if(elem3 == minElem)
            {
                resultArray[i] = minElem; ++index3; elem3 = index3 < third.length ? third[index3] : Integer.MAX_VALUE;
            }
        }
        return resultArray;
    }
}
