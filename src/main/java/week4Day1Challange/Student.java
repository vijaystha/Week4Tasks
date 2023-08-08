package week4Day1Challange;

import java.util.ArrayList;

//Exercise 3: Exercise 1: Custom Class - Student
//        Create a custom class Student with the following attributes: name (String), age (int), and grade (double). Implement a Java program that
//        uses an ArrayList to store
//        a list of students and performs the following tasks:
//        Create and add several student objects to the ArrayList.
//        Find and print the average grade of all students.
//        Print the name and age of all students who have a grade higher than 90.
public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

//            ArrayList<String>arrayList= new ArrayList<>();
        }


