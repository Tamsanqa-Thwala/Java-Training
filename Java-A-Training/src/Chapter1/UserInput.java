package Chapter1;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;

        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB Quality";
        final double HOURLY_RATE = 400;
        final double TAX = 0.25;

        Scanner input = new Scanner(System.in);
        //read in name
        System.out.println("Enter your name:");
        name = input.nextLine();

        //read in age
        System.out.println("Enter your birth year");
        birthYear = input.nextInt();

        System.out.println("Enter hours worked");
        hoursWorked = input.nextInt();
        input.nextLine();

        System.out.println("Enter your position code");
        positionCode = input.nextLine().charAt(0);

        age = CURRENT_YEAR - birthYear;
        salary = hoursWorked * HOURLY_RATE * (1 - TAX);

        // Use
        System.out.println("======| Company Name: " + COMPANY_NAME + " |======");
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Hours worked is " + hoursWorked);
        System.out.println("Salary is " + salary + " and age is " + age);


    }
}
