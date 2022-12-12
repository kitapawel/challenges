package com.filesystem;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo{

	public static void main(String[] args) throws IOException  {
		File file = new File("Output.txt");
		RandomAccessFile randomFile = new RandomAccessFile(file, "rw");
		randomFile.writeUTF("Random access demo");
		System.out.println("Current position in the file: " + randomFile.getFilePointer());
		randomFile.seek(0);
		System.out.println("Current position in the file: " + randomFile.getFilePointer());
		System.out.println(randomFile.readUTF());
		randomFile.seek(6);
		System.out.println("Current position in the file: " + randomFile.getFilePointer());
		System.out.println(randomFile.read());
		randomFile.close();
	}

}
