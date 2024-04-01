package employee.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	private  String emp_name;
	private  int emp_id;
    private  String emp_dept;
    private  String emp_position;
    
    
	public Employee(String emp_name, int emp_id, String emp_dept, String emp_position) {
		
        this.emp_name=emp_name;
        this.emp_id=emp_id;
        this.emp_dept=emp_dept;
        this.emp_position=emp_position;
    
	}
	
	

	public Employee() {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter employeee name: ");
         emp_name=in.next();
        System.out.println("Enter employeee id: ");
         emp_id=in.nextInt();
        System.out.println("Enter employeee department: ");
        emp_dept=in.next();
        System.out.println("Enter employeee position: ");
        emp_position=in.next();
	}



	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public String getEmp_position() {
		return emp_position;
	}
	public void setEmp_position(String emp_position) {
		this.emp_position = emp_position;
	}
    
    public void displayEmpInfo() {
    System.out.println("Employee details are :  "+emp_name +emp_id +emp_position +emp_dept);
    }
	
	

	
	
}
