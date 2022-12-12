package com.filesystem;

import java.io.File;
import java.io.IOException;

public class FileClassMethods {
	public static void main (String[] args) throws IOException
	{
		File file = new File("Demo.txt");
		System.out.println("File created: " + file.createNewFile());
		System.out.println("File name: " + file.getName());
		System.out.println("File path: " + file.getPath());
		System.out.println("Is it a Directory: " + file.isDirectory());
	}
}
