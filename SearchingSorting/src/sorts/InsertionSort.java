package sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};

        System.out.println("*********** Insertion Sort ************");
        System.out.println("Unsorted Array -> "+Arrays.toString(arr));
        for (int i = 1;i< arr.length;i++){
//            int count = i;
            for (int j=i;j>0;j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
//                count--;
            }
        }

        System.out.println("Sorted Array -> "+Arrays.toString(arr));
    }
}
