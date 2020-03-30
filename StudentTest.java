package assessment;


import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
      Double[] scores = new Double[]{78.0, 88.0, 90.0};
      Student s1 = new Student("Shemar", "Rida", scores);


        System.out.println(s1);
        System.out.println("Shemar's scores are :" + Arrays.toString(scores));
        System.out.println("Shemar's total score is :" + s1.totalScores(scores) );
        System.out.println("Shemar's average score is :" + s1.averageScore(scores));





    }
}
