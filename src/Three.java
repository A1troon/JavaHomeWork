public class Three {
    public static void main(String []args){
        int[] array = new int[]{3, 1, 5, 3, 2, 7, 9, 1, 2};
        InsertionSort(array);
        for(var val : array){
            System.out.print(val + " ");
        }
    }
    private static void InsertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (;; j--) {
                if ( j >= 0 && value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    array[j + 1] = value;
                    break;
                }
            }
        }

    }
}
