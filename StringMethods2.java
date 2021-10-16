package Strings;

public class StringMethods2 {
    static void spaceWithUnderscore(){
        String name = "Neeraj Shankar Yadav";
        System.out.println("The formatted name is "+name.replace(" ", "_"));
    }

    static void letterTemplate(){
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println("The template after fill: " +letter.replace("<|name|>", "Neeraj"));
    }

    static void detectSpaces(){
        String sentence = "I am going to   patna after  exams   .What is  your plan   ";
        int index = sentence.indexOf("   ");
        System.out.println("The index of triple space is: " + index);

        }


    public static void main(String[] args) {
        spaceWithUnderscore();
        letterTemplate();
        detectSpaces();
    }
}
