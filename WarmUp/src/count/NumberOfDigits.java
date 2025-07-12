package count;

public class NumberOfDigits {

    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        while (num>0){
            num = num/10;
            count++;
        }

        System.out.println("Given Number : "+num);
        System.out.println("Number of digit is "+count);
    }
}
