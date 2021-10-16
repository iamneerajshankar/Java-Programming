package Strings;

public class StringMethods {



    public static void main(String[] args) {
        //   the letters are in sequential order from index 0 to 5
        String name = "Thanos";
        int lengthOfString  = name.length();
        System.out.format("The length of the string is: " +lengthOfString);

        // convert to lowercase
        String toLowerCase = name.toLowerCase();
        System.out.format( "\n" +"The given string lower case: " +toLowerCase);

        // convert to uppercase
        String toUpperCase = name.toUpperCase();
        System.out.format( "\n" +"The given string upper case: " +toUpperCase);

        // convert to uppercase
        String full_name = "          Neeraj Shankar       ";
        String trimString = full_name.trim();
        System.out.format( "\n" +"The given string after being trimmed: " +trimString +"\n");

        //replace letter in a string
        String my_name = "Mad Titan";
        System.out.println(my_name.replace("t", "s"));

        //string starts with
        System.out.println("The name starts with Ma: " +my_name.startsWith("Ma"));

        //returns char at certain index
        System.out.println("The char at index is " + my_name.charAt(2));




    }
}
