import java.util.Arrays;

public class RemoveElement {

    public static void removeElementMethod1(int[] arr, int target){
        System.out.println("***************** Remove Element Approach 1 ********************");
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                while (i<arr.length-1){
                    arr[i] = arr[i+1];
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void removeElementMethod2(int[] arr, int target){

        System.out.println("***************** Remove Element Approach 2 ********************");
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                while (i<arr.length-1){
                    arr[i] = arr[i+1];
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void removeElementMethod2(int[] arr){

    }
    public static void main(String[] args) {
        int arr[] = {14,45,47,42,51,10,16,18,35,64};

        System.out.println("Array Elements : "+Arrays.toString(arr));
        int target = 47;
        System.out.println("Want to Remove "+target+ " From the Array");
        removeElementMethod1(arr,target);
        removeElementMethod2(arr,target);
    }
}
