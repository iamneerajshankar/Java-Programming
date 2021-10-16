package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateArrayListFromUser {
    static void arrayListFromUserInput(){
        List<String> myList = new ArrayList<>();
        System.out.println("Please enter the elements of your ArrayList: ");
        Scanner userIn= new Scanner(System.in);

        String myString = userIn.nextLine();
        myList.add(myString);

        for(int i =0;i<myList.size();i++){
            System.out.print(myList.get(i));
        }
    }



    public static void main(String[] args) {
      arrayListFromUserInput();
        //arrayListFromUserInput();
    }
}
