package io;

import java.io.FileInputStream;

public class ReadBytes {

	public static void main(String[] args) throws Exception {

		FileInputStream din = new FileInputStream("/Users/administrator/Desktop/file.txt");
		int x = 0;
		// read a char, assign it to a variable and check if the value is -1

		while ((x = din.read()) != -1) {
			System.out.print((char)x);
		}
		
		System.out.println("\nReading done.");
		din.close();

	}

}
