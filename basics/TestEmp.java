package basics;

public class TestEmp {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("John Doe");
		e1.setSalary(12345.6f);

		// Populate a1 object
		Address a1 = new Address();
		a1.setCity("Pune");
		a1.setLine("Trinity Greens, A-504");
		a1.setPincode("4110765");

		// Set the address ref inside Employee class to a1
		e1.setAddress(a1);
		System.out.println(e1);		

	}

}
