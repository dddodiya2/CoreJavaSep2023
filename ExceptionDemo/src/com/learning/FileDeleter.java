package com.learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDeleter {

	
	///Exception handling using throws keyword ////
	/*
	public double deleteFile(String fileName) throws IOException {
		Files.delete(Paths.get("", fileName));
		return 1.0;
	}
	*/
	
	//Throwing the exception to calling method
	public double deleteFile(String fileName) {
		
		try {
			Files.delete(Paths.get("", fileName));
			return 1.0;
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
			System.out.println(e.getCause());
			
			throw new ArithmeticException("Excpetion occured while deleting the file");     ///Assume there is custom exception class and throw that
		}
	}
	
	public void throwExampleMethod(int a) {
		
		if(a < 0) {
			throw new ArithmeticException("Negative values not allowed");
		}
		else {
			//.......All the processing 
		}
		
	}
	
}
