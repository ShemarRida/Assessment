package assessment;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private Double[] scores;

    public Student(String firstName, String lastName, Double[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
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

    public Double[] getScores() {
        return scores;
    }

    public void setScores(Double[] scores) {
        this.scores = scores;
    }


    public double totalScores(Double[] scores) {
        double sum = 0;
        for (int x = 0; x < this.scores.length; x++) {
            sum += this.scores[x];
        }
        return sum;
    }

    public double averageScore(Double[] scores) {
        double sum = 0;
        for(int x = 0; x < this.scores.length; x++) {
            sum += this.scores[x];
        }
            double average = sum / this.scores.length;
            return average;
        }



    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}








