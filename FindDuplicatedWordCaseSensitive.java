package Strings;


import java.util.HashMap;

import java.util.Set;

public class FindDuplicatedWordCaseSensitive {
    static void findDuplicateWords(String inputString){
        // first, we will split string (entire sentence) into String sequence of words
        String[] words = inputString.split(" ");

        //Creating a HashMap with String as keys and Integer as corresponding values
        HashMap<String, Integer> wordList = new HashMap<>();

        //Iterate each words of the input string through enhanced for loop
        for(String word: words){
            //if the word is already found in the  wordList and convert it to lower case at same time
            if(wordList.containsKey(word))
            wordList.put(word, wordList.get(word)+1);
            else
                // add word to the wordlist with key as the word itself and value as 1 to show word
                // appeared once
                wordList.put(word, 1);
        }

        //Extracting all keys of wordList
        Set<String> keys = wordList.keySet();

        // iterate through all the extracted keys and print the corresponding values of repetition
        for(String key: keys){
            if(wordList.get(key)>1){
                System.out.println(key+": "+ wordList.get(key));
            }

        }


        }

    public static void main(String[] args) {
        findDuplicateWords("Here, we go only to go at here.");
    }
    }

