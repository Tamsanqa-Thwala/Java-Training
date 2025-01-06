package Chapter1;

import javax.swing.*;

/**
 * Get input from the user using dialog boxes
 * From the JOption pane class
 */
public class UsingDialogBox {
    public static void main(String[] args) {
        // Variables
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;

        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB Quality";
        final double HOURLY_RATE = 250;
        final double TAX = 0.25;

        // Assign
        name = JOptionPane.showInputDialog("Enter your name");
        birthYear = Integer.parseInt(JOptionPane.showInputDialog("Please enter your birth year"));
        hoursWorked = Integer.parseInt((JOptionPane.showInputDialog(("Please enter hours worked"))));
        positionCode = JOptionPane.showInputDialog("Please enter your position code (S - senior, J - junior, I - intern)").charAt(0);

        salary = hoursWorked * HOURLY_RATE * (1 - TAX);
        age = CURRENT_YEAR - birthYear;

        // Use
        JOptionPane.showMessageDialog(null, "Company Name: " + COMPANY_NAME
                + "\nName: " + name
                + "\nBirth Year: " + birthYear
                + "\nAge: " + age
                + "\nHours worked: " + hoursWorked
                + "\nPosition Held: " + positionCode
                + "\nSalary: " + salary);

    }
}
