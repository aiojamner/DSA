package sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        for (int i=0;i< arr.length-1;i++){
            int minIndex = i;
            for (int j = i+1;j< arr.length;j++){
                if (arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,2,6,7,5,1};

        System.out.println("*********** Selection Sort ************");


        System.out.println("Unsorted Array : ->"+ Arrays.toString(arr) );
        selectionSort(arr);
        System.out.println("Sorted Array : -> "+Arrays.toString(arr));

    }
}
