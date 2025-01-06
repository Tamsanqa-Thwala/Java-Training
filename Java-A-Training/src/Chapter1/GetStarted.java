package Chapter1;

public class GetStarted {
    public static void main(String [] args){
        System.out.println("Welcome to Java Training!");
        // declaration
        int age;
        double height;
        float salary;
        boolean isContractor;
        String name;
        char positionCode; // (S - senior, J - junior; I - intern)

        //  Assign
        age = 20;
        height = 2.4;
        salary = 45000.50f; /* add f at the end of number to tell compiler value is a float. */
        isContractor = true;
        name = "James";
        positionCode = 'J';

        // Use
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("Salary: "+ salary);
        System.out.println("positionCode: "+ positionCode);
    }
}
