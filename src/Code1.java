import java.util.*;

public class Code1 {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to get odd digit number");
        long N= sc.nextLong();
        ArrayList<Long> ans=new ArrayList<>();
        long j=1;
        while(N>0){
            if(check((int)j)){
                    ans.add(j);
                    N=N-1;
            }
            j+=1;
        }
        System.out.println(ans.get(ans.size()-1));
    }
    static boolean check(int n) {
        while (n > 0) {
            int rem = n % 10;
            if ((rem & 1) != 1)
                return false;
            n /= 10;
        }
        return true;
    }
}