package ArrayProblemSolveing;

import java.util.Scanner;

public class FindMiniAndMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i< n;i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
