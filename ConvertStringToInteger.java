package Strings;

public class ConvertStringToInteger {

    static void convertToInteger(){
        try{
            String phoneNumber = "99";
            int numberInteger = Integer.parseInt(phoneNumber);
            System.out.println("The number in integer format: " +numberInteger);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }

    static void convertToInteger1(){
        try{
            String phoneNumber = "999";
            int numberInteger = Integer.valueOf(phoneNumber);
            System.out.println("The number in integer format: " +numberInteger);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

    convertToInteger();
    convertToInteger1();

    }

}
