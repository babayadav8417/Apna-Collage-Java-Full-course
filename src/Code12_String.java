import java.util.Arrays;
import java.util.Scanner;

public class Code12_String {
    public static void main(String[] args) {
        //String initializer and Input/output
        Scanner sc=new Scanner(System.in);
        String name ="     Tony     ";
        String fullName="Baba yadav";
        String sentance="My name is baba yadav";
        System.out.println(name+"\n"+fullName+"\n"+sentance);
        //will return length of String
        System.out.println(sentance.length());
        // will give index of exiting latter
        System.out.println(sentance.indexOf('b'));
        //will replace with given value
        System.out.println(sentance.replaceAll("[aeiou]","@"));
        //will replace old char with new char
        System.out.println(sentance.replace('y','Z'));
        //will convert all latter into lowerCase
        System.out.println(sentance.toLowerCase());
        //will convert all latter into upperCase
        System.out.println(sentance.toUpperCase());
        //indexOf function can search a word also in string
        System.out.println(sentance.indexOf("baba"));
        //indexOf function can search char from given index and String as well
        System.out.println(sentance.indexOf('a',11));
        //will return all string from given beginning index
        System.out.println(sentance.substring(11));
        //will give String in between given index
        System.out.println(sentance.substring(5,sentance.length()));
        //concat will combine two separate string
        System.out.println(sentance.concat(name));

        System.out.println(name);
        // trim function will remove leading and trailing space
        System.out.println(name.trim());
        //toCharArray will split all latter into an array
        char arr[]=sentance.toCharArray();
        for(char val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        //split will break into array by excluding given regex
        System.out.println(Arrays.toString(sentance.split("baba")));;
        //
        System.out.println(sentance.hashCode());
        //Indent function will add whitespace to given string
        String ch=sentance.indent(6);
        System.out.println(ch);
    }
}
