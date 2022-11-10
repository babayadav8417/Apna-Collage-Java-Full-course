import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        /* Conditional statement
        if,else
        else if
        switch
        break
         */
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

        if((a&1)==0){
            System.out.println(" a is even ");
        }
        else {
            System.out.println(" a is odd ");
        }

        if((b&1)==0){
            System.out.println(" b is even ");
        }
        else {
            System.out.println(" b is odd ");
        }
    }
}
