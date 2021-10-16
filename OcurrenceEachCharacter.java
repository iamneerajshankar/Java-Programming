package Strings;

import java.util.HashMap;
import java.util.Set;

public class OcurrenceEachCharacter {
    static void usingHashMap(String inputString){

        //create a hashmap with character as its key and Integer as its corresponding value
        HashMap<Character, Integer> charCounterMap = new HashMap<>();

        //convert myString into character array
        char[] charArray = inputString.toCharArray();

        //traverse trough each character of charArray
        for (char c: charArray){
            //if the character in the array is already found, then store and increase count by 1
            if(charCounterMap.containsKey(c)){
                charCounterMap.put(c, charCounterMap.get(c)+1);
            }
            else{
                charCounterMap.put(c,1);
            }
        }

        //Printing charCounterMap
        System.out.println(inputString+ ": " + charCounterMap);
    }

    public static void main(String[] args) {
        usingHashMap("Lets not get carried away");
    }
}
