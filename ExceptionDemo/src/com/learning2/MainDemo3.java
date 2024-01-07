package com.learning2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class MainDemo3 {

	public static void main(String[] args) {

		MainDemo3 m3 = new MainDemo3();
		// m3.methodOne();
		// m3.methodTwo();
		// m3.methodThree();
		try {
			m3.methodFour();
		} catch (FileNotFoundException e) {
			System.out.println("File was not present");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// m3.methodFive();

		try {
			m3.methodSix();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void methodOne() {
		int a = 100;
		int b = 0;
		System.out.println(a / b);
	}

	public void methodTwo() {

		File file = new File("abc.txt");

		try {
			FileReader reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void methodThree() {
		throw new ArithmeticException("Custom arithmatic exception");
	}

	public void methodFour() throws FileNotFoundException, IOException {
		throw new FileNotFoundException();
	}

	public void methodFive() throws ArithmeticException {
		int a = 100;
		int b = 0;
		a = a / b;
	}

	// close method or finally
	public void methodSix() throws IOException {

		File file = new File("abc.txt");
		FileReader reader = null;

		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			throw e;
		} finally {
			if (reader != null)
				reader.close();
		}

		//
		System.out.println("Lats line of methodSix");

	}

	// try with resources
	public void methodSeven() {

		// Using try-with-resources
		try (FileOutputStream fileOutputStream = new FileOutputStream("abc.txt")) {
			fileOutputStream.write(9);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}

	}
}
