import java.util.Scanner;

public class Code15_BitManupulation {
    static boolean isPowerOfTwo(int n){
        return n!=0 && ((n&(n-1))==0);
    }
    public static void main(String[] args) {
   /*     System.out.println(5<<1);
        System.out.println(5<<2);
        System.out.println(5>>1);
        System.out.println(5>>2);
        System.out.println(5^2);
        System.out.println(5|2);
        System.out.println(~5);
        // Get Bit
*/
        Scanner sc=new Scanner(System.in);/*
        System.out.println("Enter num to perform get bit");
        int num= sc.nextInt();
        System.out.println("Enter position");
        int i= sc.nextInt();
        int bitmask=1<<i-1;
        // 01001 will count position from last with 0 based
        if((num&bitmask)==0){
            System.out.println("bit was 0");
        }
        else System.out.println("bit was 1");

        // Set Bit
        System.out.println("Enter num to perform set bit");
        num=sc.nextInt();
        System.out.println("Enter position");
        i= sc.nextInt();
        bitmask=1<<i;
        System.out.println("new number is ="+(num|bitmask));

        //clear bit
        System.out.println("Enter num to perform clear bit");
        num=sc.nextInt();
        System.out.println("Enter position");
        i= sc.nextInt();
        bitmask=1<<i;
        System.out.println("newNumber is="+((~bitmask)&num));
*/
        //update bit

        //HomeWork
        //(i) is given number is power of two
        System.out.println("Enter number");
        int n=sc.nextInt();
        if(isPowerOfTwo(n)){
            System.out.println("Yes power of two");
        }
        else System.out.println("Not power of two");

        // (ii)number of 1 in given number
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println("Number of 1 in given number is ="+count);
    }
}
