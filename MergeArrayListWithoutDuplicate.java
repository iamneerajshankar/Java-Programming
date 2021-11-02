package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MergeArrayListWithoutDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(3);
        secondList.add(4);
        secondList.add(5);

        Set<Integer>  my_set = new HashSet<Integer>();
        my_set.addAll(firstList);
        my_set.addAll(secondList);

        firstList = new ArrayList<>(my_set);

        for(int i =0;i< firstList.size();i++){
            System.out.print(firstList.get(i) + " ");
        }
    }

}
