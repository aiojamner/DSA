public class UniqueElement {

    public static void main(String[] args) {
        int[] arr = {14,10,15,17,16,14,15,17,16,20};
        int unique = 0;
        for (int num:arr){
            unique ^= num;
        }

        System.out.println("The unique element is: " + unique);
    }
}
