package Chapter6;
public class DebugExercise7 {
   public static void main(String[] args) {         
     printMessage("Hello, World!");     
 }   
   
private static void printMessage(String message) {         
    System.out.println("Message: " + message);
    // remove return statement as method has void as return type
  }  
}