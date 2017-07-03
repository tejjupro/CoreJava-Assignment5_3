package package1;

public abstract class Employee       //Class declaration of Employee.
{
	int empId;         //int variable too store the value of employee id.
	String empName;        //String variable to store the employee name.
	int total_leaves;      //int variables to store the total number of leaves.
	double total_salary;     //double variable to store the total salary of the employee.
	
	//METHODS
	public abstract void calculate_balance_leaves();     //abstract method to calculate the balance of leaves.
	
	public abstract boolean avail_leave(int no_of_leaves, char type_of_leave);    //To check that leave is available or not.
	
	public abstract void calculate_salary();         //Function to calculate the salary.
	
}  //End of abstract class.