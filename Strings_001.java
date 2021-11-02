package Strings;

import java.util.Scanner;

public class Strings_001 {

    //String is a sequence of characters, string is a class
    public static void main(String[] args) {
        String name = "Neeraj";
        String name2 = new String("Shankar");
        System.out.println(name);
        System.out.format(name + "\n");
        System.out.printf(name2);

        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter any string: ");
       String name3 = userIn.nextLine();
        System.out.println(name3);
    }

}
