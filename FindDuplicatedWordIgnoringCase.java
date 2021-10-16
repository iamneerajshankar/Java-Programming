package Strings;



import java.util.HashMap;
import java.util.Set;

public class FindDuplicatedWordIgnoringCase {
    static void findDuplicateWords(String inputSentence){
        //Split the sentence to words
        String[] words = inputSentence.split(" ");

        // Create hashmap object to store String as its keys and Integer as corresponding values
        HashMap<String, Integer> wordCount = new HashMap<>();

        //Iterate each word in words with enhanced for loop
        for(String word: words){
            //if the word is already present in the wordCount and convert it to lower case at same time
            if(wordCount.containsKey(word.toLowerCase()))
            wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            else
                // add word to the wordCount with key as the word itself and value as 1 to show word
                // appeared once
                wordCount.put(word.toLowerCase(), 1);
        }

        //Extracting all the keys stored in wordCount
        Set<String> keysStored = wordCount.keySet();

        //iterate through all the extracted keys and print the corresponding values of repetition
        for(String key: keysStored){
            if (wordCount.get(key)>1){
                System.out.println(key +": "+wordCount.get(key));
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("The words which appeared more than once with their count are: ");
        findDuplicateWords("The the there there but But BUT ");
    }
}
