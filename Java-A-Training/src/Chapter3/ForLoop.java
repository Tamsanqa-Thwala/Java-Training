package Chapter3;

/**
 * For use when you know how many times you are going to loop
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            //display Tuesday 4 times
            System.out.println("Tuesday");
        }

        //display iLAB training 3 times
        for (int i = 0; i < 3 ; i++) {
            System.out.println("iLAB Training");
        }

        //multiple loop conditions
        for (int i = 0, j = 5; i < 5 && j < 10; i++, j++) {
            System.out.println("i - " + i + " | " + "j - " + j);
        }
    }
}
