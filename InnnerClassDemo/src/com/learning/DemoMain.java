package com.learning;

import com.learning.SampleInnerClassDemo.SampleInner;
import com.learning.SampleInnerClassDemo.SampleInnerStatic;

public class DemoMain {

	public static void main(String[] args) {
		
		SampleInnerClassDemo s = new SampleInnerClassDemo();
		
		s.displayInfo();
		s.i = 10;
		
		SampleInner si =   s.new SampleInner();
		
		SampleInnerStatic st = new SampleInnerStatic();
		
		

	}

}
