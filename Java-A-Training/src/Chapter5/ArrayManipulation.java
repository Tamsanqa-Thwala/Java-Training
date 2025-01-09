package Chapter5;
import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random rng = new Random();
        final int ALL_NUMBERS_COUNT = 20;
        int [] randomNumbers = new int[20];
        int evenCount = 0;
        
        for(int i = 0; i < ALL_NUMBERS_COUNT; i++){
            int x = rng.nextInt(10,75);
            if(x % 2 == 0) evenCount++;
            randomNumbers[i] = x;
        }

        int [] evenNumbers = new int[evenCount];
        int [] oddNumbers = new int[ALL_NUMBERS_COUNT - evenCount];

        int oddArrCounter = 0, evenArrayCounter = 0;
        for(int i = 0; i < ALL_NUMBERS_COUNT; i++){
            if(randomNumbers[i] % 2 == 0){
                evenNumbers[evenArrayCounter] = randomNumbers[i];
                evenArrayCounter++;
            }else{
                oddNumbers[oddArrCounter] = randomNumbers[i];
                oddArrCounter++;
            }
        }
        System.out.print("Even: ");
        for(int num: evenNumbers){
            System.out.print(num + "\t\t");
        }

        System.out.print("\nOdd: ");
        for(int num: oddNumbers){
            System.out.print(num+"\t\t");
        }
    }
}
