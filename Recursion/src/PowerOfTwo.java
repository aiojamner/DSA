public class PowerOfTwo {

//    public static int powerOfTwo(int n,int result){
//        if (n == 0){
//            return 1;
//        }
//
//        result = 2 * powerOfTwo(n-1,result) * result;
//
//        return result;
//    }

    public static boolean powerOfTwo(int num){

        if(num == 1)
        return true;
        if (num == 0 || num%2 != 0)
         return false;

        return powerOfTwo(num/2);
    }
    public static void main(String[] args) {

//        int n = 5, result =0;

        int num = 16;
        System.out.println(num+" is power of two : "+powerOfTwo(num));


        num = 18;
        System.out.println(num+" is power of two : "+powerOfTwo(num));

        num = 1;
        System.out.println(num+" is power of two : "+powerOfTwo(num));

    }
}
