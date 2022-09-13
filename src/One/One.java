package One;

public class One {
    public static void main(String []args) {
        int[] array = new int[]{3, 1, 5, 3, 2, 7, 9, 1};
        int inversion = 0;
        for (int i = 0; i < array.length; ++i)
            for (int j = i + 1; j < array.length; ++j)
                inversion += array[i] > array[j] ? 1 : 0;
        System.out.println(inversion);


    }
}
