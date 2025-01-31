package Array;
public class array_func {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int min = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
    public static void selectionSortDes(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int max = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[max] < arr[j])
                    max = j;
            }
            int tmp = arr[max];
            arr[max] = arr[i];
            arr[i] = tmp;
        }
    }
    //--------------------------------------------------------//
    public static void bubbleSort(int[] arr){
        boolean flag;
        do {
            flag = false;
            for(int i = 0; i < arr.length - 1; ++i){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    flag = true;
                }
            }
        }while(flag);
    }
    //--------------------------------------------------------//
    public static void insertionSort(int[] arr){
        int key, j;
        for(int i = 1; i < arr.length; ++i){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void insertionSortDes(int[] arr){
        int key, j;
        for(int i = 1; i < arr.length; ++i){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key > arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    //--------------------------------------------------------//
    public static void merge(int[] values, int start, int mid, int end){
        int[] sorted = new int[values.length];
        for(int i = start; i < (end-start) - 1; ++i){
            if(mid >= end)
                sorted[start++] = values[start++];
            else if (start >= mid)
                sorted[mid++] = values[mid++];
            else if(values[start] < values[mid])
                sorted[start++] = values[start++];
            else
                sorted[mid++] = values[mid++];
        }
        for(int i = 0; i <= end-start; ++i){
            values[i] = sorted[i];
        }

    }
    public static void mergeSort(int[] values, int start, int end){
        int mid;
        if(start < end){
            mid = (start+end)/2; // get the middle of the array
            mergeSort(values, start, mid); //split the array
            mergeSort(values, mid+1, end);//split the array
            merge(values, start, mid+1, end); //Merge the two arrays
        }
    }

    //--------------------------------------------------------//
    public static boolean binary_search(int[] arr, int val)
    {
        //only works with sorted arrays
        int high = arr.length - 1, low = 0;
        while (high >= low)
        {
            int mid = (high + low) / 2;
            if (arr[mid] == val)
                return true;
            else if (arr[mid] > val)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
    public static int[] removeEven(int[] arr)
    {
        int oddCount = 0, size = arr.length;
        for (int i = 0; i < size; ++i)
        {
            if(arr[i] % 2 != 0)
                oddCount++;
        }
        int idx = 0;
        int[] oddNum = new int[oddCount];
        for (int i = 0; i < size; ++i)
        {
            if(arr[i] % 2 != 0){
                oddNum[idx] = arr[i];
                idx++;
            }
        }
        return oddNum;
    }
    public static int[] moveZeroesToEnd(int[] arr)
    {
        // 1  2 0 3 0 4 0 --> 1 2 3 4 0 0 0
        int j = 0;
        for(int i = 0; i < arr.length; ++i)
        {
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if (arr[j] != 0)
                j++;
        }
        return arr;
    }
}
