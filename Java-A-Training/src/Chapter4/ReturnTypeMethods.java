package Chapter4;

public class ReturnTypeMethods {

    static String getMessage(){
        return "Hi, welcome to Java Fundamentals Course!";
    }

    static int getSum(){
        int sum = 0, num1, num2;
        num1 = 5;
        num2 = 6;

        sum = num1 + num2;
        return sum;
    }

    static boolean isEven(){
        int number = 8;
        return number % 2 == 0 ? true:false;
    }
    public static void main(String[] args) {
        getMessage();
    }
}
