package Chapter6;
public class DebugExercise5 {
   public static void main(String[] args) {
	System.out.println("Average Calculator");    
	double avg = calcAverage(1,2,3); // add semicolon to end of statement
  	System.out.println("The average is: " + avg);     
  } 

public static double calcAverage(double... numbers) {
	double results = 0; //remove extra = sign and add semicolon
	
	for (double n : numbers){
		results += n;
	} 
	return (results/ numbers.length); //add semicolon and division  by array length to get average
   } 

}