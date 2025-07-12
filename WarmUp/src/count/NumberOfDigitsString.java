package count;

public class NumberOfDigitsString {

    public static void main(String[] args) {
        int num = 123456;
        int count = String.valueOf(Math.abs(num)).length();

        System.out.println("Given Number : "+num);
        System.out.println("Number of digit is "+count);
    }
}
