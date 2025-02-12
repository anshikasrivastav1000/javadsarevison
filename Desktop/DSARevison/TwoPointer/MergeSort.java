package TwoPointer;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];


        for(int i = 0; i< n;i++){
            a[i] = in.nextInt();
        }
        int  m = in.nextInt();
        int[] b = new int[m];
     for (int j = 0; j<m;j++){
         b[j] = in.nextInt();
     }

     int[] c = new int[n + m];

     int i =0;
     int j = 0;
     int k = 0;
     while(i < n && j < m){
        if (a[i] < b[j]){
            c[k] = a[i];
            i++;

        }else {
            c[k] = b[j];
            j++;
        }
        k++;
     }
     //if j is finished and i is not finished
     while (i < n){
         c[k] = a[i];
         k++;
         i++;
     }
     //if i is finished and j is not finished
     while (j < m){
         c[k] = b[j];
         k++;
         j++;
     }
     for (int z =0;z<(n+m);z++){
         System.out.print(c[z] + " ");
     }
    }
}
