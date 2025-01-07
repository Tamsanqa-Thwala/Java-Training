package Chapter2;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayNum = 2;
        String dayOfTheWeek = "None";

        if (dayNum == 1){

        }

        switch (dayNum){
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                dayOfTheWeek = "Invalid";
        }

        System.out.println("Day of the week: " + dayOfTheWeek);

        /** Supervisor for departments:
         * 1,2 & 5 - Smith
         * 3 - Jones
         * 4 - Mokoena
         */
        int departmentId = 3;
        String supervisor = "None";

        switch (departmentId){
            case 1, 2, 5:
                supervisor = "Smith";
                break;
            case 3:
                supervisor = "Jones";
                break;
            case 4:
                supervisor = "Mokoena";
                break;
            default:
                supervisor = "unknown";
        }

        System.out.println("Supervisor for departmentId " + departmentId+ " is: " + supervisor);
    }
}
