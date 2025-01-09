package Chapter5;

import java.util.Scanner;

public class MiltiDimensionalArray {
    public static void main(String[] args) {
        final int ROWS = 2, COLS = 3;

        String [] arStudentNames = new String[ROWS];
        Scanner in = new Scanner(System.in);

        String studentName;
        int testMark;
        int [][] studentsTestMarks = new int[ROWS][COLS];
        // assign values to array
        studentsTestMarks[0] = new int[]{78, 90, 23};
        studentsTestMarks[1] = new int[]{70, 50, 60};

        String [] studentNames = {"James", "Mark"};

        double marksTotal = 0.0;
        for(int i = 0; i < ROWS; i++){
            System.out.print("Student name: " + studentNames[i]);
            for (int j = 0; j < COLS; j++) {
                System.out.print("\t\tTest " + j + ": " + studentsTestMarks[i][j] + "\t\t");
                marksTotal += studentsTestMarks[i][j];
            }
            double average = marksTotal/COLS;
            System.out.printf("Average: %.2f \t\tRemark: %s", average, average >= 60? "Pass\n":"Fail\n");
            marksTotal = 0; // reset value
        }
    }
}
