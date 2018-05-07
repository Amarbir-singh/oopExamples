
public class TestEmployee 
{
   public static void main(String[] args)
   {
	   Employee e1 = new Employee(1795482,"Amarbir","Singh",60000);
	   System.out.println(e1.getId());
	   System.out.println(e1.getFirstName());
	   System.out.println(e1.getLastName());
	   System.out.println(e1.getSalary());
	   System.out.println(e1.toString());
   }
}
