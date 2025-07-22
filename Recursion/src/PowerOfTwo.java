public class PowerOfTwo {

    public static int powerOfTwo(int n,int result){
        if (n == 0){
            return 1;
        }

        result = 2 * powerOfTwo(n-1,result) * result;

        return result;
    }

    public static void main(String[] args) {

        int n = 5, result =0;

        System.out.println("Two power "+n+" is "+powerOfTwo(n,result));
    }
}
