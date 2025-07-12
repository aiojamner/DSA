package String;

public class RecursionReverseString {

    public static String reverseStringRecursion(String str){
        if (str == null || str.length() <= 1){
            return str;
        }

        return reverseStringRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "dsaarmy";

        System.out.println("Reverse string for "+str+ " is "+reverseStringRecursion(str));
    }
}
