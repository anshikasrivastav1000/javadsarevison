package ArrayList;

import java.util.ArrayList;

public class ListOfList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(a));
        arr.add(new ArrayList<Integer>(b));
        arr.add(new ArrayList<Integer>(c));

        for(int i =0; i <arr.size();i++){
            for(int j = 0; j <arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j));
            }
            System.out.println();
        }
    }
}
