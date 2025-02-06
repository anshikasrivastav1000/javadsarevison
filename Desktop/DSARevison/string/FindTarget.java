package string;

import java.util.Scanner;

public class FindTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char target = in.next().charAt(0);

        //basic traversal
        for(int i =0; i<s.length();i++){
            if (s.charAt(i) == target){
                System.out.print(i + " ");
            }
        }
    }
}
