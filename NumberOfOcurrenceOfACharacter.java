package Strings;

public class NumberOfOcurrenceOfACharacter {
    static void characterCount(){
        String my_string = "java is java again java again";
        char a = 'a'; // character that we will check for

        int count = my_string.length() - my_string.replace("a", "").length();

        System.out.println(count);

    }

    public static void main(String[] args) {
        characterCount();
    }
}
