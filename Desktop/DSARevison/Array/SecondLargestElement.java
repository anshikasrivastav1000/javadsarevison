package Array;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE; // Change -1 to handle negative values too

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Store the previous largest
                largest = arr[i]; // Update the new largest
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i]; // Update second largest only if it's not equal to the largest
            }
        }

        // If no second largest found, print a message
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println(secondLargest);
        }
    }
}
