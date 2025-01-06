package Chapter2;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int age = 25;
        System.out.println("Original age is " + age);
        System.out.println("Pre-increment operation age is " + ++age); // value is changed before used
        System.out.println("Post-increment operation age is " + age++); // value is used then changed
        System.out.println("Value is equal: " + age + " after post-increment operation.");

        System.out.println("The same goes for post and pre-decrement oprations");
    }
}
