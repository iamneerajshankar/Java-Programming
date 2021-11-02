package InterviewPreparation;

import java.util.Scanner;

class Result1{
    public static void maxMinInteger(int[] arr){
        int n = arr.length;
        int sum =0;
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j =0;j< arr.length;j++){
                sum = sum +arr[j];
            }
            int finalSum = sum-arr[i];
            System.out.printf("The sum of all elements except %d is: ", arr[i]);
            System.out.println(finalSum);
            sum= 0;
        }

    }

}

class SudoResult{
    public static void maxInteger(int[] arr){
        int n = arr.length;
        int sum =0;
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j =0;j< arr.length;j++){
                sum = sum +arr[j];
            }
            int finalSum = sum-arr[i];
            sum= 0;
        }
    }
}
public class MaxMinInteger {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter the total number of elements: ");
        int n = userIn.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements of the array: ");
        for(int i =0;i<n;i++) {
            arr[i] = userIn.nextInt();
        }

        Result1.maxMinInteger(arr);
    }
}
