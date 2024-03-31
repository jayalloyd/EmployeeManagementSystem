package employee.management;

import java.util.Scanner;

public class MainApplication {
public static void main(String a[]) {
	System.out.println("Employee Management System");
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a valid input.1.Display Employee Information 2.Adding Employee Information 3.Updating Employee Information 4.Quit 5.Press any option to contnue");
	
	int inputOption=input.nextInt();
	
	if (inputOption == 1) {
		System.out.println("Display Employee information");
		
	}else if(inputOption==2) {
		System.out.println("Adding Employee information");
	}
	else if (inputOption==3) {
		System.out.println("Updating Employee information");
	}
	else  if (inputOption==4)
		System.out.println(" Quit Application");
	else
		
		System.out.println(" Press any option to continue using the application again");

	
	
	
			}
}
