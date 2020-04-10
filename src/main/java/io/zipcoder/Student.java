package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String result = "Exam Scores: " + "\n";
        int i = 0;

        for (Double score : examScores) {
            i++;
            result += "     Exam " + i + " -> " + score + "\n";
        }
        return result;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public Double setExamScore(int examNumber, double newScore) {
        return examScores.set(examNumber, newScore);
    }

    public Double getAverageExamScore() {
        double total = 0;

        for (Double examScore : examScores) {
            total += examScore;
        }

        return total / examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n" +
                "> " + getExamScores();
    }
}
