package io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyPaste {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("/Users/administrator/Desktop/file.txt");
		FileWriter fw = new FileWriter("/Users/administrator/Desktop/file2.txt");

		int x = 0;

		String s = "";

		while ((x = fr.read()) != -1) {
			s = s + ((char) x);
		}

		fw.write(s);

		System.out.println("Writing Data Complete.");
		fw.close();
		fr.close();
	}

}
