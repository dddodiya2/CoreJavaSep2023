package com.learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Student s1 = new Student("John", 16, "Pune", 11);
		
		FileOutputStream fos = new FileOutputStream("StudentSavingFile.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		
		File f = new File("StudentSavingFile.ser");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s2 = (Student) ois.readObject();
		
		System.out.println("Students s2 is : " + s2.getName() + " " + s2.getAge());
		
	
	}

}

