package sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0;j < arr.length-1-i;j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
            int[] arr = {4,3,9,5,7,2};

        System.out.println("*********** Bubble Sort ************");
        System.out.println("Unsorted Array : ->"+Arrays.toString(arr) );
        bubbleSort(arr);
        System.out.println("Sorted Array : -> "+Arrays.toString(arr));
    }
}
