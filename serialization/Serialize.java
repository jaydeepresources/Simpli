package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) throws Exception {

		Employee emp1 = new Employee(1, "John Doe", 12345.6f);

		// serialize this object !

		FileOutputStream fos = new FileOutputStream("/Users/administrator/Desktop/serial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp1);
		
		System.out.println("Serialization Complete !");
		
		fos.close();
		oos.close();
	}

}
