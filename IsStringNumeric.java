package Strings;

public class IsStringNumeric {
    public static void main(String[] args) {
        String string1 = "345";
        String string2 = "34.34";
        String string3 = "45tsd";
        System.out.println(isStringNumeric(string1));
        System.out.println(isStringNumeric(string2));
        System.out.println(isStringNumeric(string3));

    }
    private static boolean isStringNumeric(String string)
    {
        return string !=null && string.matches("[0-9.]+");
    }
}
