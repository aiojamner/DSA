package pattern;

public class NumberPyramid {

    public static void main(String[] args) {
        System.out.println("*************** Number Pyramid ***************");
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
