package io;

import java.io.FileWriter;

public class WriteChar {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("/Users/administrator/Desktop/file2.txt");
		String msg = "Hi, this is data.";

		writer.write(msg);

		System.out.println("Writing data complete.");

		writer.close();
	}

}
