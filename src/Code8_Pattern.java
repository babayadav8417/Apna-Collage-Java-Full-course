public class Code8_Pattern {
    public static void main(String[] args) {
        int i = 1, j = 1;
        /*
            Que.(1) Print the pattern
                * * * * *
                * * * * *
                * * * * *
                * * * * *
         */
        System.out.println("First answer");
        for (i = 1; i < 5; i++) {
            for (j = 1; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
            Que.(2) Print the pattern
                * * * * *
                *       *
                *       *
                * * * * *
         */
        System.out.println("second answer");

        for (i = 1; i < 5; i++) {
            for (j = 1; j < 6; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        /*
            Que.(3) Print the pattern
                *
                * *
                * * *
                * * * *
         */
        System.out.println("third answer");
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
            Que.(4) Print the pattern
                * * * *
                * * *
                * *
                *
         */
        System.out.println("fourth answer");
        for (i = 4; i>=0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
            Que.(5) Print the pattern
                      *
                    * *
                  * * *
                * * * *
         */
        System.out.println("fifth answer");
       for(i=1;i<=4;i++){
           for(j=4;j>i;j--){
               System.out.print("  ");
           }
           for(int k=1;k<=i;k++){
               System.out.print("* ");
           }
           System.out.println();
       }
        /*
            Que.(6) Print the pattern
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
         */
        System.out.println("Sixth answer");
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
         /*
            Que.(7) Print the pattern
                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1
         */
        System.out.println("seventh answer");
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        /*
            Que.(8) Print the pattern
                1
                2 3
                4 5 6
                7 8 9 10
         */

        System.out.println("eighth answer");
        int k=1;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
         /*
            Que.(9) Print the pattern
                1
                0 1
                1 0 1
                0 1 0 1
         */

        System.out.println("ninth answer");
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                if(((i+j)&1)==0)
                System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
         /*
            Que.(10) Print the pattern
                *             *
                * *         * *
                * * *     * * *
                * * * * * * * *
                * * * * * * * *
                * * *     * * *
                * *         * *
                *             *
         */

        System.out.println("tenth answer");
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(k=1;k<=8-(2*i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=4;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(k=1;k<=8-(2*i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
