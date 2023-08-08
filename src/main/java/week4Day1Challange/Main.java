package week4Day1Challange;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList= new ArrayList<>();

        studentList.add(new Student("Ram", 23, 90.0));
        studentList.add(new Student("Shyam", 24, 95.0));
        studentList.add(new Student("Pam", 43, 85.0));
        studentList.add(new Student("Bob", 22, 82.0));

//print average
    double totalGrade= 0.0;
    for(Student student : studentList){
        totalGrade = totalGrade+ student.getGrade();
    }
    double averageGrade= totalGrade/studentList.size();
        System.out.println("Average Grade: " +averageGrade);

// pprint name and age with grade higher than 90
        System.out.println("Student with grade higher than 90");
for(Student student : studentList) {
    if(student.getGrade()>=90){
        System.out.println("Name: " +student.getName() + ", Age :" +student.getAge());
    }
        }
          }
}
