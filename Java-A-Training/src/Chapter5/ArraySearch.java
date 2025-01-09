package Chapter5;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arNumbers = {1,24,52,25,251,51,1,423,21,5,2};
        String [] namesArray = {"Alice", "John", "Katherine", "Ezekiel", "Sophie", "Maximus", "Olivia", "Beatrice", "Liam", "Amelia", "Sebastian", "Gabrielle", "Nathaniel", "Victoria", "Benjamin", "Zoe", "Aidan", "Charlotte", "Juliana", "Christopher"};
        searchForNumber(51, arNumbers);
        System.out.println("Highest value is: "+getHighest(arNumbers));
        System.out.println("Lowest value is: "+getLowest(arNumbers));

        String name = longestName(namesArray);
        System.out.printf("The name with the most characters is %s with %d characters.", name, name.length());

    }
    static void searchForNumber(int number, int [] sourceArray){
       for(int i = 0; i < sourceArray.length; i++){
           if(number == sourceArray[i]){
               System.out.println("Number: "+number + " found at position " + i +".");
               break;
           }
       }
    }

    static int getHighest(int [] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    static int getLowest(int [] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    static String longestName(String [] namesArray){
        String longestName = namesArray[0];
        for(int i = 1; i < namesArray.length; i++){
            if(longestName.length() < namesArray[i].length()){
                longestName = namesArray[i];
            }
        }
        return longestName;
    }
}
