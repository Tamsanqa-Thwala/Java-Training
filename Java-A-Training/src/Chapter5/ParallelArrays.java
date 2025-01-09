package Chapter5;
import java.util.Scanner;
public class ParallelArrays {
    public static void main(String[] args) {
        final int SIZE = 3;
        int [] arTestMarks = new int[3];
        String [] arStudentNames = new String[SIZE];
        Scanner in = new Scanner(System.in);

        String studentName;
        int testMark;

        for(int i = 0; i < SIZE; i++){
            System.out.println("Enter name for student "+ (i+1));
            studentName = in.nextLine();

            System.out.println("Enter test mark for student "+ (i+1));
            testMark = in.nextInt();

            arStudentNames[i] = studentName;
            arTestMarks[i] = testMark;
        }
    }
}
