package com.old.learning.cloneDemo;

class Test implements Cloneable {
	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		Test t1 = new Test();
		Test t2 = (Test) t1.clone();
		t2.i = 888;
		t2.j = 999;
		System.out.println(t1.i + "---------------" + t1.j);
		System.out.println(t2.i + "---------------" + t2.j);
		
		
		Test t3 = new Test();
		Test t4 = t3;
		t4.i = 8888;
		t4.j = 9999;
		System.out.println(t3.i + "---------------" + t3.j);
		System.out.println(t4.i + "---------------" + t4.j);
		
	}
}