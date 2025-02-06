package string;

public class FindWord {
    public static boolean match(String s,String t, int startIndex){
        int i = startIndex;
        int j =0;

        while(i < s.length() && j < t.length()){
           if(s.charAt(i) != t.charAt(j))
           {
               return false;
           }
           i++;
           j++;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = " i love programming. i love to code";
        String target = "love";

        int l = s.length();

        for(int i = 0; i< l;i++){
            if(match(s ,target ,i) == true){
                System.out.println(i + " ");
            }
        }
    }
}
