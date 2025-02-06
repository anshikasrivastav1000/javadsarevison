package string;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        System.out.println(word);
        System.out.println(word.charAt(3));

        String sentance = in.nextLine();
        System.out.println(sentance);
        //print all letter in different line
        for(int i =0; i< word.length();i++){
            System.out.println(word.charAt(i));

        }
    }
}
