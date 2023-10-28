
public class IfElseDemoMain {

	public static void main(String[] args) {

		/// print the name of variable which has higher step count.

		int johnStepCount = 3000;
		int alexStepCount = 5000;

		boolean isAlexWon = alexStepCount > johnStepCount;

		if (isAlexWon) {
			System.out.println("alexStepCount won");
			System.out.println("Alex wins the prize for today");
		} else {
			System.out.println("johnStepCount won");
		}

		System.out.println("Outside of if and else");

		////////
		// Example 2

		System.out.println("\n*********************Example 2********************************\n");
		System.out.println("Curly braces are optional if there is single statement inside if or else");

		// IF its raining play indoor games else play outdoor games.
		boolean isRain = true;

		if (isRain)
			System.out.println("play indoor games");
		else
			System.out.println("Play outdoor games");

		////

		System.out.println("\n*********************Example 3********************************\n");
		System.out.println("else block is also optional");

		// if item is available then buy it else do Nothing(do not print anything)

		boolean isItemAva = false;

		if (isItemAva) {
			System.out.println("Purchase the item");
		}

		System.out.println("End of Example 3.");

		////
		System.out.println("\n*********************Example 4********************************\n");
		System.out.println(" if - else if - else if --- else ");
		
		/*
		loan ---> 
							salary < 50000 	 ---> no LOan
		           50000 < 	salary < 100000  ----> 2000000 
		          100000 <  salary < 200000  ----> 4000000
		                    salary > 200000  ----> 1 CR 
		
		Also if gender is female the loan amount shoudl be +2 Lacks 
		
		 */
		//Given the salary of the person , print the loan amount.
		double sal = 150000;
		boolean isFemale = true;
		
		
		if(sal <= 50000 ) {
			System.out.println("Sorry, you are not eligible for any loan at this time !!!!");
		}else if( (sal > 50000) &&  (sal <= 100000) ){
			double loanAmount = 2000000 ;
			
			if(isFemale) {
				loanAmount += 200000 ;
			}
			
			System.out.println("Congratulations , you are eligible for loan of : " + loanAmount );
			
		}else if(sal <= 200000 ) {
			System.out.println("Congratulations , you are eligible for loan of 4000000");
		}else {
			System.out.println("Congratulations , you are eligible for loan of 1 Crore");
		}
		
				
		System.out.println("If else programs end here");
		
	}

}

/*
//Assignments 
1. Given a number if even --> print "Number is even" else print "Number is Odd"

2. Check if a given number is divisible by 5 --> if divisible then only print "Divisble by 5"

3. Write a program to calculate income tax on given Salary.
Consider 3 parameters --> Salary, Age , Gender.
If Age > 60 give discount of 2% on tax
If Gender is Female , give discount of 1% on tax.

Sal - 0 - 2.5 Lakh   --> 0 % Tax
Sal - 2.5 - 5 Lakh   --> 5 % Tax
Sal - 5 - 10 Lakh   -->  10 % Tax
Sal - 10 - 20 Lakh  -->  20% Tax
Sal > 20 Lakh       --> 30% Tax.

You can consider flat tax system and no need to calculate slab wise taxes.
For eg. if Salary is 12,00,000 --> the tax will be 20% which --> 2,40,000  
Out of gender and Age ony one discount should be applied and not both.

So if a person is Female of 65 years age then she will get only 2% discount and not 4%.


*/