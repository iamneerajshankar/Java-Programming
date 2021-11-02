package InterviewPreparation;
/* @ author - Neeraj Shankar
* Given an array of integers and a positive integer k,
* determine the number of pairs (i,j) where i<j and arr[i] + arr[j] is divisible by k
* print their count */

import java.util.Scanner;

class Divisible_Sum_Pair_Logic{
    static void find_the_pair(int n, int k, int arr[]){
        int count =0;
        // iterate each array
        for(int i =0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sumOfPair = arr[i] +arr[j];
                if(sumOfPair % k == 0){
                    count ++;
                }
            }
        }

        // print the count of such pairs
        System.out.println("The number of such pairs in the provided list of numbers are: " +count);
    }

}

public class Divisible_Sum_Pair {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Take the count of all numbers to be entered
        System.out.println("Please enter the count of numbers: ");
        int n = userInput.nextInt();

        // Take the number which will divide the pairs
        System.out.println("[Please enter the number to divide them: ");
        int k = userInput.nextInt();

        // Take all the numbers
        int[] arr = new int[n];
        System.out.println("Please enter all the numbers: ");
        for(int i =0;i<n;i++){
            arr[i] = userInput.nextInt();
        }

        // Calling the function that contains the logic
        Divisible_Sum_Pair_Logic.find_the_pair(n, k, arr);

    }





}
