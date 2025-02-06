package string;

public class FrecunceyOfChar {
    public static void main(String[] args) {
        String a = "abc abf applesssssssssssss";
        int l = a.length();
        int maxFreq = 0;
        char answer = ' ';
        for (int i =0; i<l;i++){
           char fixedChar = a.charAt(i);
           int currentFreq = 0;

           for (int j =0; j <l;j++){
               if (a.charAt(j) == fixedChar){
                   currentFreq++;
               }
           }
           if(currentFreq > maxFreq)
           {
            maxFreq = currentFreq;
            answer = fixedChar;
           }
        }
        System.out.println(answer);
        System.out.println(maxFreq);
    }
}
