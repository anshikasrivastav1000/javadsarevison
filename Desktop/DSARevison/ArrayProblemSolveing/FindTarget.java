package ArrayProblemSolveing;

import java.util.Scanner;

public class FindTarget {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();
        int answer = -1;
        for (int i =0; i< n; i++){
            if (arr[i] == target){
                answer = i;
                break;
            }

        }

        if(answer == - 1){
            System.out.println("target no does not exits");
        }
        else {
            System.out.println("target number present at index = " + answer);
        }
        System.out.println(answer);


    }
}
