package Strings;

/*
@author - Neeraj Shankar
 */

public class ReverseString {

    //we will use buffer class and its method reverse() to reverse the string
    static void usingStringBuffer(){
        String my_String = "Neeraj Shankar";
        StringBuffer my_buffer = new StringBuffer(my_String);
        System.out.println("The original String is: " +my_String);
        System.out.println("The reversed string is :" + my_buffer.reverse());
    }

    static void usingCharArray(){
        String inputString = "Java Class";

        //converting string to char array
        char[] charArray = inputString.toCharArray();

        //run for loop in reverse order
        for(int i = charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);
        }
    }

    static String usingRecursion(String inputString){

        if(null == inputString || (inputString.length()<=1))
        {
            return inputString;
        }

        return usingRecursion(inputString.substring(1)+inputString.charAt(0));
    }

    public static void main(String[] args) {

        usingStringBuffer();
      //  usingCharArray();
       // usingRecursion("MyJava");
    }
}
