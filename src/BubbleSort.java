public class BubbleSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void BubbleSort(int[] arr){
        boolean sorted = true;
        while (sorted){
            for(int x = 0; x < arr.length-1; x++){
                for (int a = 0; a <arr.length-x-1; a++){
                if (arr[x] > arr[x+1]);
                {
                    swap(arr,x,x+1);
                }
            }
        }
    }
}}
