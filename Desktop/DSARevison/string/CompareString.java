package string;

public class CompareString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        System.out.println(a.compareTo(b));
       // 'A' ---- 'Z' (65 --90)
       //'a' ----- 'z' (97 --- 122)

       if(a.compareTo(b) < 0){
           System.out.println("B is Bigger");
       } else if (a.compareTo(b) > 0) {
           System.out.println("A is bigger");

       }else {
           System.out.println(" both are equal");
       }
        //math -> a ->97 , e ->101
        System.out.println('a' - 'e');
    };
}
