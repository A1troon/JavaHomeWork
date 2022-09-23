package Three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class One {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4  };
        ArrayList arrayList = new ArrayList();
        for(int value : array)
            arrayList.add(value);
        nextPermutations(arrayList,"");
    }
    public static void nextPermutations(ArrayList arrayList, String toWrite){
        if(arrayList.size() == 0)
            System.out.println(toWrite);
        for(var elem : arrayList){
            ArrayList nextArrayList = new ArrayList(arrayList);
            nextArrayList.remove(elem);
            nextPermutations(nextArrayList, toWrite + elem + " ");
        }
    }
}
