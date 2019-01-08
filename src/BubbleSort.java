public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void BubbleSort(int[] arr) {
        int[] arrTemp = arr;
        int swaps = -1;
        while (swaps != 0) {
            swaps = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swaps++;
                }
            }
        }
    }
}
