package com.learning;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {

	/*
	 * public static void main(String[] args) {
	 * 
	 * // TODO Auto-generated method stub System.out.println("Main method started");
	 * Demo d1 = new Demo(); d1.methodOne(0);
	 * 
	 * System.out.println("Main method completed");
	 * 
	 * //File try { Files.delete(Paths.get("", "text.txt")); //IOException
	 * }catch(Exception e) { System.out.println("File was not present"); }
	 * 
	 * String s = "123"; String s2 = "abc";
	 * 
	 * String s3 = s2.toUpperCase(); System.out.println(s3);
	 * 
	 * 
	 * // String s4 = null; //s4.toUpperCase();
	 * 
	 * int i = Integer.parseInt(s); // int i2 = Integer.parseInt(s2);
	 * 
	 * 
	 * System.out.println(i);
	 * 
	 * ///////////////////////Exception Handling ////////////////////////////////
	 * FileDeleter obj = new FileDeleter();
	 * 
	 * obj.deleteFile("abc.txt");
	 * 
	 * }
	 */

	public void methodOne(int a) {
		System.out.println("method one executions started");
		methodTwo(a);
		System.out.println("method One execustion is completed");
	}

	public void methodTwo(int a) {
		System.out.println("method two executions started");
		methodThree(a);
		System.out.println("method two execustion is completed");
	}

	public void methodThree(int a) {
		System.out.println("method three executions started");

		try {
			System.out.println(100 / a);
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println("Division by zero is not possible");
		}

		System.out.println("method three execution is completed");
	}

	// Mutiple try-catch block with parent-child relation

	/*
	public static void main(String[] args) {

		try {
			System.out.println("Line 1 in side try");
			int x = 100 / 0;
			Files.delete(Paths.get("", "text.txt")); // IOException
			System.out.println("Line 2 in side try");
			System.out.println("Line 3 in side try");
			return;
		} catch (IOException iE) {
			System.out.println("IOException:- File was not present");
		} catch (Exception e) {
			System.out.println("Exception :- Some exceptio occured" + e.getMessage());
			// return ;
		} finally {
			System.out.println("Finally block executing");
			// This block will be executed whether there is an exception occured or not !
			// Clean up / necessary code
			// eg. file close, jdbc connection
		}

		// outside try catch
		System.out.println("Outside try catch block");

	}*/

	public static void main(String args[]) throws IOException {
		
	
		// Using try-with-resources
		try (FileOutputStream fileOutputStream = new FileOutputStream("abc.txt")) {
			fileOutputStream.write(9);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
	}

}
