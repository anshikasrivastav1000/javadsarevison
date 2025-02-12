//package ArrayList;
//
//public class MajorityElement {
//
//
//    class Solution {
//        public String convert(String s, int numRows) {
//            if (numRows == 1) {
//                return s;
//            }
//
//            ArrayList<ArrayList<Character>> arr = new ArrayList<>();
//            for (int i = 0; i < numRows; i++) {
//                arr.add(new ArrayList<>());
//            }
//
//            int rowIndex = 0;
//            boolean goingDown = false;
//
//            for (int i = 0; i < s.length(); i++) {
//                arr.get(rowIndex).add(s.charAt(i));
//
//
//                if (rowIndex == 0 || rowIndex == numRows - 1) {
//                    goingDown = !goingDown;
//
//
//                    rowIndex += goingDown ? 1 : -1;
//                }
//
//
//                StringBuilder answer = new StringBuilder();
//                for (ArrayList<Character> row : arr) {
//                    for (char c : row) {
//                        answer.append(c);
//                    }
//                }
//
//                return answer.toString();
//            }
//
//            public static void main(String[] args) {
//                Solution sol = new Solution();
//                System.out.println(sol.convert("PAYPALISHIRING", 3)); // Expected: "PAHNAPLSIIGYIR"
//            }
//        }
//
//    }
