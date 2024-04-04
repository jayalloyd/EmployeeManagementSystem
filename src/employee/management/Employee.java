package employee.management;

import java.util.ArrayList;
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

    public void updateEmpInfo(ArrayList<Employee>emp_info,int emp_id,String emp_name,
    		String emp_dept,String emp_position) {
    	
        Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Employee ID : ");
		emp_id=sc.nextInt();
        for(Employee emp: emp_info) {
        			
        	if (emp_id==emp.getEmp_id()) {
        		 
        	System.out.println("Enter name :");
        	 emp_name=sc.next();
        	System.out.println("Enter Department :");
        	 emp_dept=sc.next();
        	System.out.println("Enter position:");
        	 emp_position=sc.next();
        	emp.setEmp_name(emp_name);
            	emp.setEmp_dept(emp_dept);
            	emp.setEmp_position(emp_position);
            	System.out.println("Uptdated details are : "+emp_name  +emp_dept +emp_position);
            	break;
        }}
       }
        }

    
