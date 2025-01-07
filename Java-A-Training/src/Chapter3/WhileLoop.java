package Chapter3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 0;
        while(num < 5){
            System.out.println("Tuesday");
            num++;
        }

        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("Enter a number to add: ");
        number = input.nextInt();
        while(number != 0){
            sum = sum + number;
            System.out.println("Enter a number to add: ");
            number = input.nextInt();

        }
        input.nextLine();
        System.out.println("Sum is: " + sum);

        do{
            System.out.println("I'm infinite :)");
            sum--;
        }while(sum > 0);

        //the user should enter a name that is at least 3 characters
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        while(name.length() < 3){
            System.out.println("Please enter your name: ");
            name = input.nextLine();
        }
        System.out.println("The name: " + name + " is at least 3 characters long.");
    }
}
