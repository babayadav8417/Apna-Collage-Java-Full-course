import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Code18_Recursion_9problem {
    public static int  towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer "+n+" from "+src+" to "+dest);
            return 1;
        }

        int step=towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer "+n+" from "+src+" to "+dest);
        return step+1+towerOfHanoi(n-1,helper,src,dest);
    }
    static void reverseString(String str,int i){
        if(i==str.length()){
            return;
        }
        System.out.print(str.charAt(str.length()-1-i));
        reverseString(str,i+1);
    }
    static boolean checkArray(int[]arr,int indx){
        if(indx==arr.length-1){
            return true;
        }
        if(arr[indx]>=arr[indx+1])
            return false;
        else
            return checkArray(arr,indx+1);
    }
    static String moveAllX(String str,int idx,String newstr,int count){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            return newstr;
        }
        if(str.charAt(idx)=='x'){
            count++;
        }
        else {
            newstr+=str.charAt(idx);
        }
        return moveAllX(str,idx+1,newstr,count);
    }
    static String removeDuplicasy(String str,int idx,String newstr,HashMap<Integer,Boolean>map){
        if(idx==str.length()){
            return newstr;
        }
        if(!map.get(str.charAt(idx) - 'a')){
            newstr+=str.charAt(idx);
            map.put(str.charAt(idx) - 'a',true);
        }
        return removeDuplicasy(str,idx+1,newstr,map);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Que-1 Tower of hanoi

        System.out.println("Enter number of disks");
        int n=sc.nextInt();
        System.out.println("Total number of step is ="+towerOfHanoi(n,"S","H","D"));

        //Que-2 print a string in reverse order

        System.out.println("Enter a String");
        String str=sc.next();
        reverseString(str,0);
        System.out.println();

        //Que-3 find the first occurrence and last occurrence of a character in a String

        System.out.println("Enter a string");
        str=sc.next();
        System.out.println("Enter any character to find first and last occurrence");
        char ch=sc.next().charAt(0);
        System.out.println("first occurrence of "+ch+" is at index ="+str.indexOf(ch));
        System.out.println("last occurrence of "+ch+" is at index ="+str.lastIndexOf(ch));

        //Que-3 Check an array is strictly sorted and increasing order

        System.out.println("Insert an array's size");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Array element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        if(checkArray(arr,0)){
            System.out.println("Array is in increasing order");
        }else
            System.out.println("Array is not in increasing order");

        //Que-4 Move all x to end of the string ex "axbcxxd" to abcdxxx;

        System.out.println("Enter a string ");
        str=sc.next();
        System.out.println("Without using recursion");
        char elm[]=str.toCharArray();
        Arrays.sort(elm);
        System.out.println("all x goes end of String ="+new String(elm));
        System.out.println("with recursion ");
        System.out.println(moveAllX(str,0,"",0));

        //Que-5 Remove duplicate in a string

        System.out.println("Enter a String");
        str= sc.next();
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(i,false);
        }
        System.out.println("newString after remove duplicate char ="+removeDuplicasy(str,0,"",map));

    }
}
