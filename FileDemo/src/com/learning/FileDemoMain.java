package com.learning;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemoMain {

	public static void main(String[] args) {
		
		/*
		 * File f = new File("SampleFile.txt");
		 * 
		 * if(f.exists()) { System.out.println("File exists"); } else {
		 * System.out.println("File does not exist");
		 * System.out.println("Creating new file"); f.createNewFile(); }
		 * 
		 * System.out.println("After creating file");
		 * 
		 * if(f.exists()) { System.out.println("File exists"); } else {
		 * System.out.println("File does not exist"); }
		 * 
		 * f.isDirectory(); ///This will give false; f.isFile(); ////True
		 * 
		 * FileWriter fw = new FileWriter(f);
		 * fw.write("Some people are late for class"); fw.write("\n");
		 * fw.write("But there might be some genuine reason for being late");
		 * fw.flush(); fw.close();
		 */
		
		System.out.println("\n\nFile reading");
		try(FileReader fr=new FileReader("SampleFile.txt")) {
			int i=fr.read(); //more amount of data
			while(i!=-1)
			{
				System.out.print((char)i);
				i=fr.read();
			}
		} catch (Exception e) {
			System.out.println("Exception occured" + e.getMessage());
		}
		
		/*
		File f1 = new File("C:\\Users\\Dodiya's\\Documents\\Divyesh_Study_Material\\Class_Notes\\CoreJava_Batch_Aug_2022");
		System.out.println(Arrays.toString(f1.list()));
		String[] fileNames = f1.list();
		
		
		for(String fileName : fileNames) {
			File f2 = new File("C:\\Users\\Dodiya's\\Documents\\Divyesh_Study_Material\\Class_Notes\\CoreJava_Batch_Aug_2022", fileName);
			System.out.println("File " + fileName + " isFile " + f2.isFile());
			
			System.out.println("File " + fileName + " length " + f2.length());
		}
	*/	
	}

}
