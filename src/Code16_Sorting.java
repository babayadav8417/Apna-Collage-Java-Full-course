import java.util.Arrays;
import java.util.Scanner;

public class Code16_Sorting {
    // Selection sort
    static  int[] selectionSort(int[]arr1){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                   int temp=arr1[i];
                   arr1[i]=arr1[j];
                   arr1[j]=temp;
                }
            }
        }
        return arr1;
    }
    // Bubble sort
    static int[] bubbleSort(int[]arr2){
        for(int i=0;i<arr2.length-1;i++){
            for(int j=0;j<arr2.length-1-i;j++){
                if(arr2[j]>arr2[j+1]){
                    //swap
                    int temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        return arr2;
    }
    // Insertion sort
    static  int[] insertionSort(int[]arr3){
        for(int i=1;i<arr3.length;i++){
            int curr=arr3[i];
            int j=i-1;
            while(j>=0 && curr<arr3[j]){
                arr3[j+1]=arr3[j];
                j--;
            }
            arr3[j+1]=curr;
        }
        return arr3;
    }
    // Binary search
    static  int binarySerach(int[]arr5,int key){
        Arrays.sort(arr5);
        int str=0;
        int end=arr5.length-1;
        while(str<=end){
            int mid=(str+end)/2;
            if(arr5[mid]==key){
                return mid;
            }else if(arr5[mid]>key){
                end=mid-1;
            }else {
                str=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("sorted array by using selection sort");
        int[] arr1=arr.clone();
        for(int val:selectionSort(arr1))
            System.out.print(val+" ");
        System.out.println();

        System.out.println("sorted array by using bubble sort");
        int[] arr2=arr.clone();
        for(int val:bubbleSort(arr2))
            System.out.print(val+" ");
        System.out.println();

        System.out.println("sorted array by using insertion sort");
        int[] arr3=arr.clone();
        for(int val:insertionSort(arr3))
            System.out.print(val+" ");
        System.out.println();


        System.out.println("sorted array by using inbuilt function");
        int arr4[]=arr.clone();
        Arrays.sort(arr4,2,5);
        for(int val:arr4)
            System.out.print(val+" ");
        System.out.println();
        Arrays.sort(arr4);
        for(int val:arr4)
            System.out.print(val+" ");
        System.out.println();

        // Searching
        System.out.println("Enter val to search in array");
        int val= sc.nextInt();
        int arr5[]=arr.clone();
        System.out.println("val searched in array by using Binary search");
        if(binarySerach(arr5,val)>0){
            System.out.println("Given is at "+binarySerach(arr5,val));
        }else {
            System.out.println("Not found");
        }
        System.out.println("val searched in array by using inbuilt function");
        Arrays.sort(arr5);
        System.out.println("Given is at "+Arrays.binarySearch(arr5,val));
    }
}
