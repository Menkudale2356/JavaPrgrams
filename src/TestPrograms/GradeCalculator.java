package TestPrograms;

import java.util.Scanner;

public class GradeCalculator {
    //displays the letter grade for a given numerical score (eg., A, B,C,D,or F)
    // based on the following grading scale
    //A:90-100, B:80-89, C:70-79, D:60-69, F:0-59

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numerical score: ");
        int score = input.nextInt();
        char grade = 0;

        if (score >= 90&&score<=100) {
            grade = 'A';
        } else if (score >= 80&&score<=90) {
            grade = 'B';
        } else if (score >=70&&score<=80) {
            grade = 'C';
        } else if (score >=60&&score<=70) {
            grade = 'D';
        } else if (score >=0&&score<=60) {
            grade = 'F';
        } else {
            System.out.println("Invalid Score");
        }
        System.out.println(grade);

    }
}
        

