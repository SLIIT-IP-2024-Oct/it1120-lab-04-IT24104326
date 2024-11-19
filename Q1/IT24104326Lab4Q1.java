import java.util.Scanner;

public class IT24104326Lab4Q1 {

   public static void main (String[] args) {

	// Declare the variables
	int number;

	// Create a Scanner object to read
	Scanner input = new Scanner (System.in);

	// Prompt the user to enter a number
	System.out.print("Enter a number: ");
	number = input.nextInt() ;

	// Determine whether the number is positive or nega
	if (number > 0) {
	   System.out.println("The number is: Positive");
	}
	else if (number < 0){ 
	    System.out.println("The number is: Negative");
	}
	else {
 	    System.out.println("The number is: Zero");
	}
    }
}