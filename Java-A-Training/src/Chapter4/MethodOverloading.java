package Chapter4;

public class MethodOverloading {
    static int calcSum(int num1, int num2, int num3){
        return num1 + num2 + num2;
    }

    static int calcSum(int num1, int num2){
        return num1 + num2;
    }

    static  double calcSum(double num1, double num2){
        return num1 + num1;
    }

    static float calcSum(float num1, float num2){
        return  num1 + num2;
    }

    static int sum(int... numbers){ //takes in any number of arguments
        int total = 0;
        for(int num: numbers){
            total += num;
        }
        return total;
    }

    public static <T> void displayNumbers(T x, int y){
        System.out.println("x " + x);
    }
    public static void main(String[] args) {
        MethodOverloading.<Integer>displayNumbers(2,4); // calling generic method while enforcing a specific data type
    }
}
