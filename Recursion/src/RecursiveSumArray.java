import java.util.Arrays;

public class RecursiveSumArray {

    public static int arraySum(int[] arr,int i){

        if (i == 0){
            return 1;
        }

        return arr[i] + arraySum(arr,i-1);
    }
    public static void main(String[] args) {

        int[] arr = {1,5,6,7,8};

        System.out.println("Array -> "+ Arrays.toString(arr));
        System.out.println("For above array sum is "+arraySum(arr,arr.length-1));

    }
}
