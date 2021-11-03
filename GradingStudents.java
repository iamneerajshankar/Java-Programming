package InterviewPreparation;

import java.util.Scanner;

/*
* HackerLand University has the following grading policy: Every student receives a grade in
* the inclusive range from 0 to 100. Any grade less than 40 is a failing grade. Sam is a professor
* at the university and likes to round each student's grade according to these rules:
    If the difference between the grade and the next multiple 5 of is less than 3, round  grade
    up to the next multiple of 5.
    If the value of is less than 38, no rounding occurs as the result will still be a failing grade.
Examples
grade = 84 round to 85(85 - 84 is less than 3)
do not round (result is less than 40)
do not round (60 - 57 is 3 or higher) */

class Round_up_grade{
    static void round_up_marks(int n, int[] marks){
        for(int i = 0;i<n;i++){
            int round_marks = marks[i] + (5-(marks[i]%5));
            if(marks[i]<38){
                System.out.println(marks[i]);
            }
            else if(marks[i]%5 ==0){
                System.out.println(marks[i]);
            }
            else if(round_marks -marks[i]<3){
                System.out.println(round_marks);
            }
            else {
                System.out.println(marks[i]);
            }
        }
    }
}

public class GradingStudents {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Take the numbers of marks
        System.out.println("Please enter the number of marks:");
        int n = userInput.nextInt();

        //take all the marks
        int[] marks = new int[n];
        System.out.println("Please enter all the marks: ");
        for(int i=0;i<n;i++){
            marks[i] = userInput.nextInt();
        }


        Round_up_grade.round_up_marks(n,marks);

    }

}
