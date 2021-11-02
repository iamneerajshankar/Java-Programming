package Strings;

public class FindRepeatString {


    static String findString(String my_string){
        boolean check = true;

        for(int i =0;i<my_string.length();i++){
            for (int j=0;i< my_string.length();j++){
                if(my_string.charAt(i)==my_string.charAt(j)){
                    check = true;
                    break;
                }
                else{
                    check = false;
                }

            }
        }
        if(check){
            System.out.println("The string is repeated");
        }
        else{
            System.out.println("No repeated");
        }
        return my_string;
    }

    public static void main(String[] args) {
      String  my_string = "Niraj";
        findString(my_string);

    }
}
