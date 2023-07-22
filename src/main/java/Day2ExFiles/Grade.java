package Day2ExFiles;
//Exercise 4: Student Grading
//        Scenario: You are developing a student grading application for a teacher. You need to implement a feature that calculates the
//        average grade of students in a class.
//        Given : Grades for Five Students as : 8,9,5,4,8
//        Task: Write a program that calculates their average grade. Print the average grade.
//// here also use appropriate data type.
public class Grade {
    public static void main(String[] args) {
        double a= 9, b= 5, c= 4, d = 8;
        double avg= (a+b+c+d)/4;
        System.out.println("Average grade is " + avg );
    }
}
