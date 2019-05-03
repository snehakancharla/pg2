package com.stackroute.pg2;
import java.util.Scanner;

public class Student {

    private final int GRADE_MINIMUM = 0;
    private final int GRADE_MAXIMUM = 100;

    private int[] grades;

    // main() method
    public static void main(String[] args)
    {
        Student  aGradesStatistics = new Student();

        aGradesStatistics.readGrades();
        System.out.printf("The average is %1.2f\n", aGradesStatistics.average());
        System.out.printf("The minimum is %1$d\n", aGradesStatistics.minimumGrade());
        System.out.printf("The maximum is %1$d\n", aGradesStatistics.maximumGrade());
    }

    // read students' grades
    private void readGrades()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberStudens = in.nextInt();

        grades = new int[numberStudens];

        int i = 0;
        while (i < numberStudens)
        {
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
            int grade = in.nextInt();
            if (GRADE_MINIMUM <= grade && grade <= GRADE_MAXIMUM)
            {
                grades[i] = grade;
                i++;
            }
            else {
                System.out.println("Error! Grade must be integer between 0 and 100!");
            }
        }
    }
    //finding minimum
    private int minimumGrade()
    {
        if (grades.length == 0) {
            return 0;
        }

        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            min = (min > grades[i]) ? grades[i] : min;
        }
        return min;
    }
    //finding maximum
    private int maximumGrade()
    {
        if (grades.length == 0) {
            return 0;
        }

        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            max = (max < grades[i]) ? grades[i] : max;
        }
        return max;
    }
    //finding average
    private double average()
    {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (sum / grades.length);
    }
}
