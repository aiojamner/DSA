package numbers;

public class ReverseDigit {

    public static void main(String[] args) {
        int num = 123456;
        int original = num;

        int result = 0;

        while (num > 0){

            int digit = num % 10;
            result = result * 10 + digit;

            num = num / 10;

        }

        System.out.println("The reverse integer for "+original+" is "+result);
    }
}
