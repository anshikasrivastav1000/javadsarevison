//package TwoPointer;
//
//public class RemoveDuplicateElement {
//    public static void main(String[] args) {
//        int[] n = {1,1,1,2,2,3,3,3};
//        int k = n.length;
//        int i =0;
//        int j =0;
//        int index =0;
//
//        while (i<k){
//           k[index] = k[i];
//           index++;
//
//           while (i<n && k[i] == k[j]){
//               i++;
//           }
//           i =j;
//        }
//        return index;
//    }
//}
package TwoPointer;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] n = {1, 1, 1, 2, 2, 3, 3, 3};
        int k = n.length;
        int index = 0;
        int i = 0;

        while (i < k) {
            n[index] = n[i];  // Fix: Use 'n' instead of 'k'
            index++;

            // Move i forward while the next element is the same
            while (i < k && n[i] == n[index - 1]) {
                i++;
            }
        }

        // Print the new array length
        System.out.println("New length after removing duplicates: " + index);

        // Print the modified array
        System.out.print("Modified array: ");
        for (int j = 0; j < index; j++) {
            System.out.print(n[j] + " ");
        }
    }
}
