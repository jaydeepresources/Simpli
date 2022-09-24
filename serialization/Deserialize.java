package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("/Users/administrator/Desktop/serial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e = (Employee) ois.readObject();
		
		System.out.println(e);

	}

}
