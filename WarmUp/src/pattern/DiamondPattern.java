package pattern;

//                *
//               * *
//              * * *
//             * * * *
//              * * *
//               * *
//                *

public class DiamondPattern {

    public static void main(String[] args) {
        System.out.println("****************** Diamond Pattern *******************");
        for (int i=1;i<=4;i++){
            for (int j=i;j<4;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=3;i>=1;i--){
            for (int j=4;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
