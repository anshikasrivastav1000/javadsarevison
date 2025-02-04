package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        for(i = 0; i < arr.length; i++ ){
           arr[i] = in.nextInt();
        }
       // System.out.println(Arrays.toString(arr));

        for(i = 0; i < arr.length; i ++){
            System.out.println(arr[i] + " ");
        }
        for (int num : arr){ // for every element in array ,print the element
            System.out.println(num + ""); //here num represent element of the array
        }
    }
}
