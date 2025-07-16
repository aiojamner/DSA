public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {31,22,40,35,43,10,45,33};

        mergeSort(arr,0, arr.length-1);

        System.out.println("Sorted Array");
        for (int num : arr){
            System.out.print(num+", ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if (left< right){
            int mid = left + (right-left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid,right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int l1 = mid - left + 1;
        int l2 = right - mid;

        int[] L = new int[l1];
        int[] R = new int[l2];

        for (int i=0;i<l1;i++){
            L[i] = arr[left+i];
        }
        for (int j=0;j<l2;j++){
            R[j] = arr[mid+1+j];
        }

        int i = 0, j = 0, k = left;
        while (i< l1 && j < l2 ){
            if (L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        while (i<l1){
            arr[k++] = L[i++];

        }
        while (j<l2){
            arr[k++] = R[j++];
        }
    }
}
