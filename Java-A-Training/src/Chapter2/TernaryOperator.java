package Chapter2;

public class TernaryOperator {
    public static void main(String[] args) {
        // condition ? valueWhenConditionT:valueWhenConditionF
        int age = 25;
        if (age >= 18 ){
            System.out.println("Can vote");
        }else{
            System.out.println("Cannot vote");
        }

        System.out.println(age >= 18 ? "Can vote": "Cannot vote");

        int number = 7;
//        String results = number % 2 == 0 ? "Even":"Odd";

        String results = (number % 2 == 0 ? "Even": (number % 3 == 0 ? "Multiple of 3": (number % 5 == 0 ? "Multiple of 5": "Odd")));
        System.out.println(results);
    }
}
