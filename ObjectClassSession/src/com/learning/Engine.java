package com.learning;

public class Engine {

	private String ignitionType;

	@Override
	public String toString() {
		return "Engine [ignitionType=" + ignitionType + "]";
	}

	public Engine(String ignitionType) {
		super();
		this.ignitionType = ignitionType;
	}

	public String getIgnitionType() {
		return ignitionType;
	}

	public void setIgnitionType(String ignitionType) {
		this.ignitionType = ignitionType;
	}

	public static void main(String[] args) {

		int i = 100;
		System.out.println(i);

		String s = "Hello";
		System.out.println(s);
		System.out.println(s.toString());

		Engine e = new Engine("Electric Start");
		System.out.println(e);
		System.out.println(e.toString());

	}

}
