import java.util.Arrays;

public class MergeSort2 {

    public static void main(String[] args) {
        int[] nums1 = {14,15,12,35,16};
        int[] nums2 = {25,31,34,20};

        System.out.println("Unsorted Array : ");
        for (int num : nums1){
            System.out.print(num+", ");
        }
        for (int num1 : nums2){
            System.out.print(num1+", ");
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] merged = merge(nums1, nums2);

        System.out.println("\nSorted Array : ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < m) result[k++] = nums1[i++];
        while (j < n) result[k++] = nums2[j++];

        return result;
    }
}
