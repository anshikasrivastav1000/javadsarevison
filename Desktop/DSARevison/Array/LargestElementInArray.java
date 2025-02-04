package Array;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int largest = arr[0];
        for(int i =0; i< n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }

        }
        System.out.println(largest);



    }
}
