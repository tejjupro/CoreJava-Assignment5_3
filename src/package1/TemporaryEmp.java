package package1;

public class TemporaryEmp extends Employee 
{
	//No new property. All properties are same as super class.
	
	//Creating constructor using fields in super class.
	public TemporaryEmp(int empId,String empName,int total_leaves,double total_salary)
	{
		//Initializing class variables with parameters passed in the constructor.
		this.empId=empId;
		this.empName=empName;
		this.total_leaves=total_leaves;
		this.total_salary=total_salary;
	}

	@Override
	//Calculating total leaves that is same as passed one.
	public void calculate_balance_leaves() 
	{
		System.out.println("Total leaves available for Employee are "+total_leaves);    //Printing Statement.
	}

	@Override
	//Method to check leave is available or not.
	public boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		//For Temporary Employee, there is nothing like type of leave, So, he will always pass 'l' or 'L' as second parameter.
		
		//Checking that user wants leave.
		if(type_of_leave=='l' || type_of_leave=='L')
		{
			//Checking that leave is available or not.
			if(no_of_leaves < total_leaves)
				return true;
		}
	    //If above condition does not hold then return false.
		return false;
	}

	@Override
	//Method to print total salary.
	public void calculate_salary() 
	{
		System.out.println("Total salary of Employee is "+total_salary);    //Printing Statement.
	}
	
	
}   //End of class
