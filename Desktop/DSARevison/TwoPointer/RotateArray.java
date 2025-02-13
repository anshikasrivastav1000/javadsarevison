//package TwoPointer;
//
//public class RotateArray {
//    class Solution {
//        public void rotate(int[] nums, int k) {
//            int n = nums.length;
//            k = k % n; // Handle cases where k > n
//
//            // Reverse the whole array
//            reverse(nums, 0, n - 1);
//            // Reverse the first part (n-k elements)
//            reverse(nums, 0, n - k - 1);
//            // Reverse the remaining part (last k elements)
//            reverse(nums, n - k, n - 1);
//        }
//
//        private void reverse(int[] arr, int start, int end) {
//            while (start < end) {
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//            }
//        }
//    }
//
//}

//https://leetcode.com/problems/rotate-array/
