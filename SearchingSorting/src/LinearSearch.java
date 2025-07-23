public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {4, 9,1,0,2};
        int target = 8, count = 0, flag = 0;

        while (count<arr.length){
            if(arr[count++] == target){
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println(count);
        else
            System.out.println("Not found");
    }
}
