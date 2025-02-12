//package ArrayList;
//
//public class PascalTriangle {
//    class Solution {
//        public List<List<Integer>> generate(int numRows) {
//            List<List<Integer>> answer = new ArrayList<>();
//            List<Integer> FirstRow = new ArrayList<>();
//            FirstRow.add(1);
//            answer.add(new ArrayList<>(FirstRow));
//            int middleElements = 0;
//            for(int i =1; i<numRows;i++){
//                List<Integer> currentRow = new ArrayList<>();
//                currentRow.add(1);
//
//                //middleElemts
//
//                for(int j =1 ; j<= middleElements; j++ ){
//                    int element = answer.get(i-1).get(j) + answer.get(i -1).get(j -1);
//                    currentRow.add(element);
//                }
//                currentRow.add(1);
//                answer.add(new ArrayList<>(currentRow));
//                middleElements++;
//            }
//            return answer;
//        }}
//
//}
