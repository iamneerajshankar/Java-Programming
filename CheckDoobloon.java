package Strings;

public class CheckDoobloon {
    public static void main(String[] args) {
        String my_string = "Great responsibility";
        int count;

        //Converts given string into character array

        char string[] = my_string.toCharArray();

        System.out.println("The duplicate characters in string: ");
        //Counts each character present in the String
        for(int i=0;i<string.length;i++){
            count =1;
            for (int j=i+1;j< string.length;j++){
                if(string[i]==string[j] && string[i]!=' '){
                   count ++;

                   string[j]='0'; //Set string[j] to 0 to avoid printing visited character


                }
            }
            if(count>1 && string[i]!='0'){
                System.out.print(string[i] +" ");
            }
        }



    }
}
