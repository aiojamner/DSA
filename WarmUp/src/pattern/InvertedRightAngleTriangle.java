package pattern;


//        * * * *
//        * * *
//        * *
//        *

public class InvertedRightAngleTriangle {

    public static void main(String[] args) {
        System.out.println(" *************** Inverted Right Angled Tringle Pattern *********** ");
        for (int i=4;i>0;i--){
            for (int j=0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
