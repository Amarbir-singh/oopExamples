
public class Employee
{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    Employee(int id, String firstName, String lastName,int salary)
    {
    	this.id = id;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.salary = salary;
    }
    public int getId()
    {
    	return id;
    }
    public String getFirstName()
    {
    	return firstName;
    }
    public String getLastName()
    {
    	return lastName;
    }
    public int getSalary()
    {
    	return salary;
    }
    public int getAnnualSalary()
    {
    	return 12*salary;
    }
    public int raiseSalary(int percent)
    {
    	return salary+(salary*percent)/100;
   
    }
    public String toString()
    {
    	return "The employee with the id "+id+" and name "+firstName+" "+lastName+" has a salary "+salary;
    }
    
    
    
}
