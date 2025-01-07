package Chapter2;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = true, c = false;
        int x = 5, y = 6, z = 3;
        boolean results;

        results = (a && b);
        System.out.println("a && b " + results);

        results = (a || b);
        System.out.println("a || b " + results);

        /**
         * Rules:
         * You cannot have:
         *  - T || T
         *  - F && F
         */

//        String str = "hello";
//        System.out.println(str.length());
//        int [] arr = {1,3};
//        for(int num : arr){
//            System.out.println(num);
//        }
    }
}
