import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        System.out.println("********** Bubble Sort ***********");

        int[] arr = {15,18,13,5,17,3,6,8};

        for (int i = 0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Sorted Array"+ Arrays.toString(arr));
    }
}
