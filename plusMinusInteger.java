package InterviewPreparation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result{
    public static void plusMinus(int[] arr){
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        int n = arr.length;

        for (int i =0;i<arr.length;i++){
            if ((arr[i]<0)){
                countNegative++;
            }
            else if(arr[i]>0){
                countPositive++;
            }
            else {
                countZero++;
            }
        }
        //convert integer count to float
        float floatPositiveCount = (float)countPositive/(float)n;
        float floatNegativeCount = (float)countNegative/(float)n;
        float floatZeroCount = (float)countZero/(float)n;

        System.out.printf("The probability of Positive Integer is: %.6f \n", floatPositiveCount);
        System.out.printf("The probability of Negative Integer is: %.6f \n", floatNegativeCount);
        System.out.printf("The probability of Zero Integer is: %.6f \n", floatZeroCount);


    }
}

public class plusMinusInteger {
    public static void main(String[] args) throws IOException {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter the size of your array: ");
        int n = userIn.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter the elements of the array: ");
        for(int i =0;i<n;i++){
            arr[i] = userIn.nextInt();
        }

        Result.plusMinus(arr);

    }
}
