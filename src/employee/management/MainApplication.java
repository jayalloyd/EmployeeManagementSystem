package employee.management;

import java.util.Scanner;

public class MainApplication {
public static void main(String a[]) {
	System.out.println("Employee Management System");
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a valid input.1.Display Employee Information 2.Adding Employee Information 3.Updating Employee Information 4.Quit ");
	
	int inputOption=input.nextInt();

			
		
			
	
	do {
	    if (inputOption == 1) {
	        System.out.println("Displaying Employee information");
	        // Display employee information here
	        // You can call a method or perform any necessary actions here
	        System.out.println("Press any option to continue");
	    } else if (inputOption == 2) {
	        System.out.println("Adding Employee information");
	        System.out.println("Press any option to continue");
	    } else if (inputOption == 3) {
	        System.out.println("Updating Employee information");
	        System.out.println("Press any option to continue");
	    } else if (inputOption == 4) {
	        System.out.println("Quit Application");
	        break; // Exit the loop if user chooses to quit
	    } else {
	        System.out.println("Invalid option");
	    }
	    // Prompt for option again
	    System.out.println("Enter your option:");
	    inputOption = input.nextInt();
	} while (true); // Loop indefinitely until user chooses to quit

}
}