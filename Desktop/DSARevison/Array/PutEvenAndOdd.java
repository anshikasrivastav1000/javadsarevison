package Array;

import java.util.Scanner;

//Put even And Odd in separate array
public class PutEvenAndOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr =  new int[n];

        for (int i = 0; i< n; i++){
            arr[i] = in.nextInt();
        }
        int countEven = 0;
        int countOdd = 0;

        for(int i =0; i<n;i++){
            if(arr[i] % 2 == 0){
                countEven++;
            }else {
                countOdd++;
            }

        }
        //create array
        if(countEven > 0){

            for (int i =0; i< n ;i++){
                if (arr[i] % 2 == 0)
                {
                    System.out.println(arr[i] + " ");
                }
            }
            System.out.println();
        }
        if(countOdd > 0){
            for (int i =0; i< n ;i++){
                if (arr[i] % 2 != 0)
                {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();

        }

    }
}
