package string;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "abccba";
        int i = 0;
        int j = s.length() -1;
        boolean flag = true; //assume that all are palindrome
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;

        }
        if(flag == true){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
