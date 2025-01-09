package Chapter4;
import java.util.Scanner;

public class DetermineGrade {
    static final int CURRENT_YEAR = 2025;
    static String firstname, lastname, grade;
    static int age, birthYear, testMark;

    public static void greetings(){
        System.out.println("Welcome to the grade determining program!");
    }

    public static String determineGrade(int testMark){
        String grade = "";
        if(testMark < 40){
            grade = "F";
        }else if(testMark >= 40 && testMark <= 49){
            grade = "D-";
        }else if(testMark >= 50 && testMark <= 59){
            grade = "D";
        }else if(testMark >= 60 && testMark <= 69){
            grade = "C";
        }else if(testMark >= 70 && testMark <= 79){
            grade = "B";
        }
        else if(testMark >= 80 && testMark <= 89){
            grade = "A";
        }
        else if(testMark >= 90){
            grade = "A+";
        }
        return grade;
    }

    public static int determineAge(int birthYear){
        return CURRENT_YEAR - birthYear;
    }

    public static void displayOutput(){
        System.out.println("Firstname: " + firstname + "\nLastname: " + lastname + "\nAge: " + age + "\nGrade: " + grade );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        greetings(); // greet user
        System.out.println("Enter your firstname:");
        firstname = in.nextLine();

        System.out.println("Enter your lastname:");
        lastname = in.nextLine();

        System.out.println("Enter your birth year:");
        birthYear = in.nextInt();

        System.out.println("Enter your test mark:");
        testMark = in.nextInt();

        age = determineAge(birthYear);
        grade = determineGrade(testMark);

        displayOutput();//display information

        in.close(); //close scanner
    }
}
