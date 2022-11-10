public class Code13_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("baba lll yadav");
        System.out.println(sb);
        // you can add anything in string by using append function
        System.out.println(sb.append(true));
        //
        char str[]= {'a','b','c','d'};
        System.out.println(sb.append(str));
        //delete function will delete word b/w given index
        System.out.println(sb.delete(4,8));
        //insert will add at given index
        System.out.println(sb.insert(3,45));
        //reverse will reverse the StringBuilder
        System.out.println(sb.reverse());
        //
        System.out.println(sb.replace(2,8," how are you "));
    }
}
