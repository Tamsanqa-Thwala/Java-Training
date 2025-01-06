package Chapter2;

public class ComparisonOperators {
    public static void main(String[] args) {
        boolean results;
        results = (2 == 2.0);
        System.out.println("2 == 2.0 results: " + results);

        results = (3 > 7);
        System.out.println("3 > 7 results: " + results);

        results = (8.0 >= 8);
        System.out.println("8.0 >= 8 results: " + results);

        results = (13 <= 23);
        System.out.println("<= results: " + results);
    }
}
