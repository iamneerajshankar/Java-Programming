package Strings;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    static void removeSpaces(String inputString){
        System.out.println("The original String" +inputString);
        // logic to remove white spaces
        String stringWithoutWhiteSpaces = inputString.replaceAll("\\s+", "");
        System.out.println("The String after removal of white spaces: " +stringWithoutWhiteSpaces);
    }

    static void removeSpacesWithoutBuiltFunction(String inputString){
        // program to demonstrate removal of white spaces without using built-in function
        char[] charArray = inputString.toCharArray();
        String inputStringWithoutSpaces = "";
        for (int i =0;i<charArray.length;i++){
            //checks for whitespaces and tab. Only concatenate if there is/are spaces in between them.
            if( (charArray[i] !=' ') && (charArray[i]!='\t')){
                inputStringWithoutSpaces = inputStringWithoutSpaces +charArray[i];
            }
        }
        System.out.println("The original string: " +inputString);
        System.out.println("The String without whitespaces: "+inputStringWithoutSpaces);
    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        //take input string from user
        System.out.println("Please enter the string to remove whitespaces from: ");
        String inputString = userIn.nextLine();
        userIn.close();
        //removeSpaces(inputString);
        removeSpacesWithoutBuiltFunction(inputString);
    }
}
