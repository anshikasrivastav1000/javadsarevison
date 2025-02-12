package ArrayList;

import java.util.ArrayList;

public class InputArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(8);
        arr.add(4);

        System.out.println(arr.size());
        for(int i =0; i<arr.size();i++){
            System.out.println(arr.get(i) + " ");
        }
    }
}
