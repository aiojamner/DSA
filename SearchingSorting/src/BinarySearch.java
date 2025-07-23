import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        System.out.println("************ Binary Search Approach 1 ************");
        int left = 0,right = arr.length - 1;

        while (left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid] == target){
                return mid+1;
            }else if (arr[mid]>target){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target,int left, int right){
        if (left>right)
            return -1;

        int mid = left + (right-left)/2;

        if (arr[mid] == target)
            return mid+1;
        else if (arr[mid]>target){
            return binarySearch(arr,target,left,mid-1);
        }
        else {
            return binarySearch(arr,target,mid+1,right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,6,9,15,20,25,35};
        System.out.println("Original Array : -> ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Number found at "+binarySearch(arr,9));

        System.out.println("************ Binary Search Approach 2 ************");
        System.out.println("Number found at "+binarySearch(arr,9,0,arr.length-1));
    }
}
