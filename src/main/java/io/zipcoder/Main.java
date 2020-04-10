package io.zipcoder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScore = {100.0, 125.0, 250.0, 0.0};
        Student s1 = new Student("John", "Doe", examScore);

        classroom.addStudent(s1);

        Student[] enrollment = classroom.getStudents();
        System.out.println(Arrays.toString(enrollment));

        classroom.removeStudent("John", "Doe");

        Student[] resignation = classroom.getStudents();
        System.out.println("===================");
        System.out.println(Arrays.toString(resignation));

    }
}
