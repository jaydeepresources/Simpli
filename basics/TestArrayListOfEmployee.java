package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListOfEmployee {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		ArrayList<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Data for Employee: id, name, salary");
			Employee e1 = new Employee();
			e1.setId(s.nextInt());
			e1.setName(s.next());
			e1.setSalary(s.nextFloat());

			// Populate a1 object
			System.out.println("Enter Data for Address: line, city, pincode");
			Address a1 = new Address();
			a1.setCity(s.next());
			a1.setLine(s.next());
			a1.setPincode(s.next());

			// Set the address ref inside Employee class to a1
			e1.setAddress(a1);

			list.add(e1);
		}
		

		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
