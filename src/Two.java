public class Two {
    private static int heapSize;
    public static void main(String []args){
        int[] array = new int[]{3, 1, 5, 3, 2, 7, 9, 1, 2};
        HeapSort(array);
        for(var val : array){
            System.out.print(val + " ");
        }
    }

    public static void HeapSort(int[] a) {
        buildHeap(a);
        while (heapSize > 1) {
            swap(a, 0, heapSize - 1);
            heapSize--;
            maxHeapify(a, 0);
        }
    }
    private static void buildHeap(int[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            maxHeapify(a, i);
        }
    }
    private static void maxHeapify(int[] array, int index){
        int l = 2 * index + 1;
        int r = 2 * index + 2;
        int largest = index;
        if (l < heapSize && array[index] < array[l]) {
            largest = l;
        }
        if (r < heapSize && array[largest] < array[r]) {
            largest = r;
        }
        if (index != largest) {
            swap(array, index, largest);
            maxHeapify(array, largest);
        }

    }

    private static void swap(int[] array, int first, int second) {
        array[first]^=array[second];
        array[second]^=array[first];
        array[first]^=array[second];
    }

}
