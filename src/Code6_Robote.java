import java.util.Scanner;

public class Code6_Robote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("""
                (1) Hello
                (2) Namaste
                (3) Bonjour
                """);
        System.out.println("Select your choice");
        int ch= sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Hello :)");
                break;
            case 2:
                System.out.println("Namaste (:");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Please choose correct option");
                break;
        }
    }
}
