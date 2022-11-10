public class Code7_loops {
    public static void main(String[] args) {
        /*
            for loop
            while loop
            do while loop
         */
        // (i) for loop
        System.out.println("(i) for loop");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        // (ii) While loop
        System.out.println("(ii) While loop");
        int i=0;
        while(i<=10){
            System.out.println(i++);
        }
        // do while loop
        System.out.println("(iii) do while loop");
        i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
