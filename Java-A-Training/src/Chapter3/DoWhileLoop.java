package Chapter3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        do{
            System.out.println("Enter your name: ");
            name = in.nextLine();
        }while(name.length() < 3);

        String response, selectedFruit = null;
        /**
         * Select a fruit:
         * A - Apple
         * B - Banana
         * C - Mango
         * O - Orange
         */
        do{
            System.out.println("Select a fruit:\nA - Apple\n" +
                    "B - Banana\n" +
                    "M - Mango\n" +
                    "O - Orange");
            response = in.nextLine();
            switch (response){
                case "A":
                    selectedFruit = "Apple";
                    //
                case "B":
                    selectedFruit = "Banana";
//                    break
                case "M":
                    selectedFruit = "Mango";
//                    break;
                case "O":
                    selectedFruit = "Orange";
//                    break;
            }
        }while(!response.equals("A") && !response.equals("B") && !response.equals("M") && !response.equals("O"));
        System.out.println(selectedFruit);
    }
}
