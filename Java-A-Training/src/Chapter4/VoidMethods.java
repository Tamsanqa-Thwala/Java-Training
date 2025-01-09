package Chapter4;

import java.util.Scanner;

public class VoidMethods {
    /**
     * Voids methods do not return any data back to the caller
     */

    static String firstname, lastname, empNumber;
    static int age;
    static double height;

    void displayMessage(){
        System.out.println("This is a void method!");
    }

    static void getUserDetails(){
        Scanner in = new Scanner(System.in);
        String firstname, lastname, empNumber;
        int age;
        double height;

        System.out.println("Enter firstname:");
        firstname = in.nextLine();
        System.out.println("Ënter lastname:");
        lastname = in.nextLine();

        System.out.println("Enter employee no.:");
        empNumber = in.nextLine();

        System.out.println("Enter age:");
        age = in.nextInt();

        System.out.println("Enter height:");
        height = in.nextDouble();

        System.out.println("Firstname: " + firstname + " Lastname: " + lastname + " employeeNumber: " + empNumber);
    }

    public static void displayDetails(){
        System.out.println("Firstname: " + firstname + " Lastname: " + lastname + " employeeNumber: " + empNumber);
    }
    public static void main(String[] args) {
        VoidMethods obj = new VoidMethods();
        obj.displayMessage();
        VoidMethods.getUserDetails();
    }
}
