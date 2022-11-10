import java.util.Scanner;

public class Code10_1DArray {
    public static int search(int []arr,int a){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static int[]maxMin(int[]arr){
        int ans[]=new int[2];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val<min){
                min=val;
            }
            if(val>max){
                max=val;
            }
        }
        ans[0]=max;
        ans[1]=min;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array size");
        int n= sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the array element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }


        System.out.println("Output of array element");
        for(int val:arr){
            System.out.print(val+" ");
        }

        System.out.println();
        System.out.println("Enter number to search");
        int a= sc.nextInt();
        if(search(arr,a)>0){
            System.out.println("index of search element in array is="+search(arr,a));
        }else {
            System.out.println("Not found");
        }

        System.out.println("Maximum and minimum element in array =");
        for(int val:maxMin(arr)){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
