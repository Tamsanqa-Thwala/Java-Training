package Chapter5;

import java.util.Scanner;

public class JaggedArrays2 {
    public static void main(String[] args) {
        final int SIZE = 3;
        String [] arNames = new String[SIZE];
        String [][] arPersons = new String [SIZE][];
        String [] arHobbies;
        int hobbyCount = 0;
        String strName, strHobby;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < SIZE; i++){
            System.out.println("Enter name for person "+ (i+1) + ": ");
            strName = in.nextLine();

            System.out.println("How many hobbies for " + strName +": ");
            hobbyCount = in.nextInt();
            arHobbies = new String[hobbyCount];

            for(int j = 0; j < arHobbies.length;j++ ){
                strHobby = in.nextLine();
                arHobbies[j] = strHobby;
            }
            arPersons[i] = arHobbies;
        }
    }
}
