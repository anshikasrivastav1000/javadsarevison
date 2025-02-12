package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteArrayElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        while (in.hasNextInt()){

            if(in.hasNextInt())
            {
                int x = in.nextInt();
                arr.add(x);
            }else {
                String wrongInput = in.next();
            }


        }
        for (int i =0; i< arr.size();i++){
            System.out.println(arr.get(i) + " ");
        }
        }
    }

