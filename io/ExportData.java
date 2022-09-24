package io;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ExportData {

	public static void main(String[] args) throws IOException {

		// Name, Branch, City

		DataInputStream din = new DataInputStream(System.in);

		String[] data = new String[3];

		System.out.println("Enter Name, Branch, City");

		data[0] = din.readLine();
		data[1] = din.readLine();
		data[2] = din.readLine();

		String s = "| Name\t\t\t| Branch\t\t\t| City\t\t\t|\n";

		for (String string : data) {
			s += "| " + string + "\t\t\t|";
		}

		FileWriter writer = new FileWriter("/Users/administrator/Desktop/file5.txt");
		writer.write(s);
		System.out.println("Writing Complete.");
		writer.close();

	}

}
