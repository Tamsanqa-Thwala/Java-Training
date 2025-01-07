package Chapter3;

public class LoopTerminationTechniques {
    public static void main(String[] args) {
        /**
         * break - exit out of the loop
         * continue - skip the current iteration
         */
        for (int i = 0; i < 10; i++){
            System.out.println("i = " + i);
            if (i == 9)
                break; // exits the loop
        }
    }
}
