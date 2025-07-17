import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr1 = {0,1,0,3,0,12};

        int[] arr2 = {0,1,0,0,3,14,12,0};

        System.out.println("Before Zeros Move\n"+Arrays.toString(arr1));
        moveZeros1(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Before Zeros Move\n"+Arrays.toString(arr2));
        moveZeros2(arr2);

        System.out.println(Arrays.toString(arr2));

    }

    public static void moveZeros1(int[] arr){

        System.out.println("*********** Move Zeros Approach 1 **************");
        int index = 0;
        for (int num : arr){
            if(num!=0){
                arr[index++] = num;
            }
        }
        while (index< arr.length){
            arr[index++] = 0;
        }
    }

    public static void moveZeros2(int[] nums) {
        System.out.println("*********** Move Zeros Approach 2 **************");
        int left = 0;

        for(int right = 0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
