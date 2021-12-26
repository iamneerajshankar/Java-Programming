package InterviewPreparation;
/*
* From a given array of string in small letter, find the first character that is not repeated in the entire string
* eg - Input : abbcda
*      Output: c
* However, if there are not non-repeating element found, returns underscore.
* eg- Input: bbaaccdd
*     Output: _
* */
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class FirstNonRepeatingChar{

    //using naive method - Time complexity : O(n^2)
    public char usingNaiveMethod(String s){
        for(int i =0;i<s.length();i++){
            boolean isDuplicate = false;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                return s.charAt(i);
            }
        }
        return '_';
    }

    //Using HashMap - Time complexity 2n ~ n
    public char usingHashMapTechnique(String s){
        HashMap<Character, Integer> char_count = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(char_count.containsKey(c)){
                char_count.put(c, char_count.get(c)+1);
            }
            else{
                char_count.put(c, 1);
            }
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(char_count.get(c)==1){
                return c;
            }
        }
        return '_';
    }

    //Using built in method - index of
    public char usingBuiltInMethod(String s){
        for (int i =0;i<s.length(); i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return s.charAt(i);
            }
        }
        return '_';
    }
}

public class First_Non_Repeating_Character {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/nshankar/PROGRAMMING/JAVA_PROGRAMMING/src" +
                "/InterviewPreparation/interview.txt");
        Scanner usrIn = new Scanner(System.in);
        System.out.println("Please enter the string to check: ");
        String inputString = usrIn.nextLine();

        //crate object of the class and call member function
        FirstNonRepeatingChar obj = new FirstNonRepeatingChar();

       //fw.write(obj.usingNaiveMethod(inputString));
       fw.write(obj.usingHashMapTechnique(inputString));
       fw.close();
    }


}
