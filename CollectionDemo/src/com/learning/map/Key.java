package com.learning.map;

public class Key {

	String key;
	
	public Key(String key) {
		this.key = key;
	}
	
	public int hashCode() {
		return (int) key.charAt(0);
	}
	
}
