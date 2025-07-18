import java.util.Arrays;

public class MissingNumber {

    public static void missingNumber1(int[] arr){

        int minNum = Integer.MAX_VALUE;
        int n = arr.length+1;

        int expectedNum = n * (n+1) /2;
        int actualSum = 0;


        for (int num: arr){
            actualSum += num;
        }


        System.out.println("Missing element is : "+(actualSum - expectedNum));
    }
    public static void main(String[] args) {

        int[] arr = {3,5,4,8,2,6,9};

        System.out.println("Array we have :"+ Arrays.toString(arr));
        missingNumber1(arr);





    }
}
