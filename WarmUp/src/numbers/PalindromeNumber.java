package numbers;

public class PalindromeNumber {

    public static boolean checkPalindromeNumber(int num){

        int original = num;
        int result = 0;
        while(num>0){
            int digit = num % 10;
            result = result * 10 + digit ;
            num = num/10;
        }

        return result == num;
    }
    public static void main(String[] args) {

        int num = 12321;
        if (checkPalindromeNumber(num)){
            System.out.println(num+" is palindrome ");
        }else {
            System.out.println(num+" is not palindrome");
        }
    }
}
