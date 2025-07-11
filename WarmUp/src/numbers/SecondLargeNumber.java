package numbers;

import java.util.Arrays;

public class SecondLargeNumber {

    public static void main(String[] args) {
        int arr[] = {23,40,30,12,20,43};

        int firstMax = 0;
        int secondMax = 0;
        for (int i=0;i< arr.length;i++){
            if(firstMax<arr[i]){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if(secondMax<arr[i] && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }

        System.out.println("Array : ");
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("Second Largest element of above array is "+secondMax);
    }
}
