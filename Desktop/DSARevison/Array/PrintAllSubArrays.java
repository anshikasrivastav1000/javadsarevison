package Array;

import java.util.Scanner;

public class PrintAllSubArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){   //starting point
            for (int j = i; j < n ; j++){// ending point
                for(int k = i; k<=j;k++){
                    System.out.println(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
