package Strings;

import java.util.Scanner;

public class NumberOfWords {
    static void wordCount(String inputString){
        //Split the in input string in words first
        String[] words = inputString.split(" ");

        System.out.println("The number of words in the provided sentence is: " +words.length);
    }

    static void lengthOfEachWord(String inputString){
        //split the sentence into words
        String[] words = inputString.split(" ");

        //printing the length of each word in words
        System.out.println("The length of each words for the provided sentence is here: ");
        for (String word: words){
            System.out.println(word + ": " +word.length());
        }
    }

    static void wordCount2(String inputString){
        int count =1;
        for (int i = 0;i<inputString.length()-1;i++){
            if(inputString.charAt(i)== ' ' && inputString.charAt(i+1)!= ' '){
                count ++;
            }
        }
        System.out.println("The number of words in the given string : " +count);
    }

    public static void main(String[] args) {
        //Take string from user
        System.out.println("Please enter any sentence: ");
        Scanner userIn = new Scanner(System.in);
        String inputString = userIn.nextLine();
        //calling the wordCount method
        wordCount(inputString);
        //calling the lengthOfEachWordMethod
        lengthOfEachWord(inputString);

        //calling wordCount2 method
        wordCount2(inputString);
    }
}
