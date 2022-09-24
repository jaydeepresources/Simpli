package io;

import java.io.FileReader;

public class ReadChar {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("/Users/administrator/Desktop/file.txt");

		int x = 0;

		while ((x = reader.read()) != -1)
			System.out.print((char) x);

		reader.close();
	}

}
