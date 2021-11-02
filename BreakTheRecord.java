package InterviewPreparation;


import java.util.Scanner;

public class BreakTheRecord {

    static void breakTheRecord(int n, int[] scores){
        int countOfBreakMin =0;
        int countOfBreakMax = 0;
        int MaxScore = scores[0];
        int minScore = scores[0];

        for(int i =1;i<n;i++){
            if(scores[i]>MaxScore){
                countOfBreakMax++;
                MaxScore= scores[i];
            }
            if(scores[i]<minScore){
                countOfBreakMin++;
                minScore= scores[i];
            }
        }
        System.out.println(countOfBreakMax +" "+countOfBreakMin);

    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        //Take number of games played from user
        System.out.println("Please enter the number of games played: ");
        int n = userIn.nextInt();

        //Take the score of each match from the user
        System.out.println("Please enter the score of the each match: ");
        int[] scores = new int[n];
        for(int i =0;i<n;i++){
            scores[i] = userIn.nextInt();
        }

        breakTheRecord(n,scores);


    }

}
