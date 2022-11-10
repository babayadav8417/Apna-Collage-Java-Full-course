import java.util.ArrayList;
import java.util.Scanner;

public class Code9_function {

    static void printMyName(String name){
        System.out.println(name);
    }

    static float average(int a,int b,int c){
        return (a+b+c)/3f;
    }
    static ArrayList<Integer> allOdd(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                ans.add(i);
        }
        return ans;
    }
    static int oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                sum+=i;
        }
        return sum;
    }

    static int sum(int a,int b){
        return a+b;
    }

    static int multiplication(int a,int b){
        return a*b;
    }
    static int factorial(int n){
        if(n<0){
            System.out.println("factorial of negative number cannot find");
            return -1;
        }
        if(n==1 || n==0)
            return 1;

        return n*factorial(n-1);
    }

    static void greaterElement(int a,int b){
        System.out.println("largest number out of two number ="+(a>b?a:b));
    }
    static int gcdOfTwoNumber(int a,int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else b=b-a;
        }
        return a;
    }
    static ArrayList<Integer> fibonacciSeries(int n){
        int a=0;
        int b=1;
        int c=0;
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(a);
        ans.add(b);
        while((n-2)>0){
            c=a+b;
            a=b;
            b=c;
            ans.add(c);
            n--;
        }
        return ans;
    }
    public static String decimalToBinary(int n){
        return Integer.toBinaryString(n);
    }
    static String decimalToOctal(int n){
        return Integer.toOctalString(n);
    }
    static String decimalToHexa(int n){
        return Integer.toHexString(n);
    }
    static int reverseOfNumber(int n){
        return Integer.reverse(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        printMyName(name);

        System.out.println("Enter two number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("sum of two number= "+sum(a,b));

        System.out.println("Enter two number");
        int c= sc.nextInt();
        int d= sc.nextInt();
        System.out.println("product of two number = "+multiplication(c,d));

        System.out.println("Enter a number");
        int n= sc.nextInt();
        System.out.println("factorial of a given number = "+factorial(n));
        System.out.println("Enter three number ");
        int a1= 7;
        int a2= 5;
        int a3= 3;
        System.out.println("Average of given three number is ="+average(a1,a2,a3));

        System.out.println("eneter number two get all odd");
        int n1= 15;
        System.out.println("All odd= "+allOdd(n1));

        System.out.println("Enter a number");
        n= 9;
        System.out.println("sum of all odd number="+oddSum(n));

        System.out.println("Enter two number");
        a= 5;
        b= 9;
        greaterElement(a,b);


        System.out.println("Enter two number");
        a= 25;
        b= 35;
        System.out.println("GCD of two number ="+gcdOfTwoNumber(a,b));

        System.out.println("enter how  many fibonacci you want ");
        a= 25;
        System.out.println("fibonacci series ="+fibonacciSeries(a));

        System.out.println("Enter a decimal number to get binary");
        a= sc.nextInt();
        System.out.println("Binery representation of num ="+decimalToBinary(a));

        System.out.println("Octa representation of num ="+decimalToOctal(a));

        System.out.println("Hexa representation of num ="+decimalToHexa(a));

        System.out.println("Reverse of given number ="+reverseOfNumber(12345));
    }
}
