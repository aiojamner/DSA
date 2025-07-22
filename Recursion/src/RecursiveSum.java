public class RecursiveSum {

    public static int recursiveSum(int n){

        if (n == 1){
            return 1;
        }

        return n + recursiveSum(n-1);
    }
    public static void main(String[] args) {

        int n = 5;

        System.out.println("For first "+n+" number sum is "+recursiveSum(5));
    }
}
