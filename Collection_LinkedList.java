package Collections;

/*LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the
manipulation is fast because no shifting is required.
* */

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_LinkedList {


    static void demoLinkedList(){
        LinkedList<String> myLinkedList = new LinkedList<>(); //Creating arraylist

        //Adding object in arraylist
        myLinkedList.add("Vinay");
        myLinkedList.add("Praveen");
        myLinkedList.add("Arun");
        myLinkedList.add("Anita");

        //Traversing list through Iterator
        Iterator<String> my_iterator = myLinkedList.iterator();
        while(my_iterator.hasNext()){
            System.out.println(my_iterator.next());
        }

    }

    public static void main(String[] args) {
        demoLinkedList();
    }
}
