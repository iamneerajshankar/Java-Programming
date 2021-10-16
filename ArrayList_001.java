package Collections;

import java.util.ArrayList;

public class ArrayList_001 {

    static void printArrayList(){
        //creating object of the array list
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(0, 12);
        list1.add(1, 10);
        list1.add(2, 7);
        list1.add(3, 17);

        System.out.print("The first list is as: ");
        for (int i=0;i< list1.size();i++){
            System.out.print(list1.get(i) + ", ");
        }
        System.out.print("\n");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(101);
        list2.add(102);
        System.out.print("The second list is as: ");
        for (int i=0;i< list2.size();i++){
            System.out.print(list2.get(i) + ", ");
        }
        System.out.print("\n");

        //append second list to first one
        list1.addAll(list2);
        System.out.print("The first list after merging: ");
        for (int i=0;i< list1.size();i++){
            System.out.print(list1.get(i) + ", ");
        }


    }
    public static void main(String[] args) {
        printArrayList();
    }

}
