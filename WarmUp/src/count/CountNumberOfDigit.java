package count;

public class CountNumberOfDigit {

    public static void main(String[] args) {
        int num = 1234567;

        int count = (num == 0)? 1 : (int)(Math.log(num)) + 1;

        System.out.println("Given Number : "+num);
        System.out.println("Number of digit is "+count);
    }
}
