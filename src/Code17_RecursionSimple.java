import java.util.Scanner;

public class Code17_RecursionSimple {
    static void seariesIndescending(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        seariesIndescending(n-1);
    }
    static  void seariesInAscending(int n,int a){
        if(n==1){
            System.out.print(a);
            return;
        }
        System.out.print(a+" ");
        seariesInAscending(n-1,a+1);
    }
    static int sumOfNatural(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNatural(n-1);
    }
    static  int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }
    static void fibonacci(int n,int a,int b){
        if(n-2==0)
            return;
        if(a==0 && b==1){
            System.out.print(a+" "+b+" ");
        }
        int c=a+b;
        System.out.print(c+" ");
        fibonacci(n-1,b,c);
    }
    static int pow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }
    public static void main(String[] args) {

        //Que(1) print number from 5 to 1 or 1 to 5 ?.

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        System.out.println("In descending order");
        seariesIndescending(num);
        System.out.println();
        System.out.println("In Ascending order");
        seariesInAscending(num,1);
        System.out.println();

        //Que(2) print sum of first natural numbers

        System.out.println("Enter natural number");
        num= sc.nextInt();
        System.out.println("sum of first natural numbers="+sumOfNatural(num));

        //Que(3) print factorial of given number

        System.out.println("Enter number to get factorial of that number");
        num= sc.nextInt();
        System.out.println("Factorial of given number is ="+fact(num));

        //Que(4) print fibonacci series

        System.out.println("Enter number");
        num= sc.nextInt();
        System.out.print("fibonacci series is =");fibonacci(num,0,1);
        System.out.println();

        //Que(5) print x^n

        System.out.println("Enter exponential number");
        num= sc.nextInt();
        System.out.println("Enter base number");
        int x= sc.nextInt();
        System.out.println("Answer "+x+"^"+num+"="+pow(x,num));
        // Note-If you want that time complexity should be log(n) then you can modify

        // Que-
    }
}
