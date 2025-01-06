package Chapter1;

public class UsingConstants {
    public static void main(String [] args){
        // Variable declaration
        int age;
        int birthYear;
        int hoursWorked;
        double salary;
        String name;
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB Quality";
        final double HOURLY_RATE = 400;
        final double TAX = 0.25;

        //Assignment
        name = "Jordan";
        birthYear = 2000;
        hoursWorked = 300;
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
