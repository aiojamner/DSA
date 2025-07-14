import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElement {

    public static void duplicateElementMethod1(int[] arr){
        System.out.println("********************* Remove Duplicate Element Approach 1 ****************************");
        int[] arr2 = new int[arr.length];
        int size = 0;
        Arrays.sort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }else {
                arr2[size] = arr[i];
                size++;
            }
        }
        System.out.println("Duplicate Element Removed "+Arrays.toString(arr2));

    }

    public static void duplicateElementMethod2(int[] arr){
        System.out.println("********************* Remove Duplicate Element Approach 2 ****************************");

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr){
            uniqueSet.add(num);
        }
        System.out.println("Duplicate Element Removed "+uniqueSet);

    }
    public static void main(String[] args) {
        int[] arr = {15,15,18,19,42,14,16,12,14,15,16,18};
                  //{12,14,14,15,15,15,16,16,18,18,19,42};

        duplicateElementMethod1(arr);

        duplicateElementMethod2(arr);
    }
}
