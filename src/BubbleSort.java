public class BubbleSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = i;
        arr[i] = temp;
    }

    public static void BubbleSort(int[] arr){
        boolean sorted = true;
        while (sorted){
            for(x = 0; x < arr.length; x++){
                if (arr[x] > arr[x+1];
                {
                    swap(arr,x,x+1);
                    sorted = false;
                }
            }
        }
    }
}
