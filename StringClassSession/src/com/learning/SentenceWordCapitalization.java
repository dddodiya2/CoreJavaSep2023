package com.learning;

public class SentenceWordCapitalization {

	public static void main(String[] args) {
		
		/*
		int a = 'a';
		int A = 'A';
		
		System.out.println(a-A );
		
		char c = 'z';
		c = (char) ( c - 32) ;
		
		System.out.println(c);
		*/
		String s = "Java is a fun programming language and so is python";
		
		String[] sArray = s.split(" ");
		
		System.out.println(sArray);
		
		
		String outputString = new String();
		
		for(int i =0 ; i < sArray.length ; i++) {
			
			
			String firstCharacter = sArray[i].substring(0,1);
			firstCharacter = firstCharacter.toUpperCase();
			String remainingCharacter = sArray[i].substring(1);
			sArray[i] = firstCharacter.concat(remainingCharacter);
			
			sArray[i] = sArray[i].substring(0,1).toUpperCase().concat(sArray[i].substring(1));
			outputString = outputString.concat(sArray[i]).concat(" ");
		}
		
		outputString = outputString.trim();
		
		System.out.println(outputString);

	}

}
