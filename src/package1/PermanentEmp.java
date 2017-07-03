package package1;

public class PermanentEmp extends Employee         //Class declaration inherited from abstract class Employee.
{
	int paid_leave,sick_leave,casual_leave;      //int variables for leaves.
	double basic,hra,pfa;         //Declaring double variables.
	
	
	//Constructor using some fields of this class and its super class.
	public PermanentEmp(int empId,String empName,int paid_leave, int sick_leave, int casual_leave, double basic) 
	{
		//Initializing class variables by parameters passed in Constructor.
		this.empId=empId;
		this.empName=empName;
		this.paid_leave = paid_leave;
		this.sick_leave = sick_leave;
		this.casual_leave = casual_leave;
		this.basic = basic;
	}


	@Override
	//Method to calculate number of leaves.
	public void calculate_balance_leaves() 
	{	
		this.total_leaves = paid_leave + sick_leave + casual_leave;
		//Total leaves are sum of all leaves.
		
		System.out.println("Total leaves of Employee are "+total_leaves);      //Printing Statement.
		System.out.println("In which "+this.paid_leave+" are of type paid, "+this.sick_leave+" are of type sick, "+this.casual_leave+" are of type casual.");
	}


	@Override
	//Method to check that particular type of leave is available or not. 
	public boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		//Checking that which type of leave user wants.
		if(type_of_leave=='p' || type_of_leave=='P')
		{
			//Checking that leave is available or not. 
			if(no_of_leaves < paid_leave)
				return true;
			else 
				return false;
		}
		
		if(type_of_leave=='s' || type_of_leave=='S')
		{
			if(no_of_leaves < sick_leave)
				return true;
			else 
				return false;
		}
		
		if(type_of_leave=='c' || type_of_leave=='C')
		{
			if(no_of_leaves < casual_leave)
				return true;
			else 
				return false;
		}
		
		
		return false;
	}


	@Override
	//Method to calculate total salary of Employee.
	public void calculate_salary() 
	{
		//Initializing hra and pfa.
		pfa = (12 * basic)/100;
		hra = (50 * basic)/100;
		
		this.total_salary = basic + hra - pfa;     //Finding total salary.
		
		System.out.println("Total salary of Employee is "+total_salary);     //Printing Statement.
	}
	
	
}    //End of class