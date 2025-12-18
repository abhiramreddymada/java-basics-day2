public class GradeCalculator{

    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int[] testScores = {95, 82, 76, 61, 45};

        for (int score : testScores) {
            System.out.println("Marks: " + score + " → Grade: " + calculateGrade(score));
        }
    }
}