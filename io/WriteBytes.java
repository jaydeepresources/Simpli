package io;

import java.io.FileOutputStream;

public class WriteBytes {

	public static void main(String[] args) throws Exception{
		
		String msg = "Hi, this is data.";
		
		FileOutputStream fos = new FileOutputStream("/Users/administrator/Desktop/file2.txt");

		byte[] data = msg.getBytes(); // convert a String into a byte[]
		fos.write(data);
		
		System.out.println("Writing data complete.");
		
		fos.close();
		
	}

}
