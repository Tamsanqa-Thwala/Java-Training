package Chapter5;

public class JaggedArrays {
    public static void main(String[] args) {
        //create a jagged array | an array of arrays
        String [][] arHobbies = new String[3][];
        arHobbies[0] = new String[]{"Madness", "James"};
        arHobbies[1] = new String[]{"Soccer", "Games", "Cricket"};
        arHobbies[2] = new String[]{"Madden", "UFC", "Rugby", "Football"};

        System.out.println("Hobbies array: " + arHobbies[0][1]);
    }
}
