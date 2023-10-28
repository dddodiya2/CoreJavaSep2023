
public class ForLoopDemo {

	public static void main(String[] args) {

		//print numbers from 10 to 1 ;
		
		for(int i=10 ; i >= 1 ; i--) {
			System.out.println(i);
		}
		
		
		//Print all elements of array
		
		System.out.println("\n\nPrint all elements of array");
		
		String[] colors = {"Violet", "Indigo" , "Blue", "Green", "Yellow", "Orange", "Red"};  // 6, 7  --> length-1
		
		for(int j = 0 ; j < colors.length ; j++) {
			System.out.println(colors[j]);
		}
		
		//Print all elements of array in reverse order 
		System.out.println("\n\nPrint all elements of array in reverse order");
		
		int k ;
		for(k = colors.length-1 ; k >= 0 ; k--) {
			System.out.println(colors[k]);
		}
		
		System.out.println(k);
		
		//Find maximum element
		
		System.out.println("\n\nFind maximum element of an array");
		 
		int[] numbers = {78 , 89 , 54, 64 ,99 , 12} ;

		int max = numbers[0];
		int indexOfMax = 0;
		
		for(int i = 1 ; i < numbers.length ; i++) {
			if( numbers[i]  > max ) {
				max = numbers[i] ;
				indexOfMax = i ;
			}
		}
		
		System.out.println("Max = " + max);
		System.out.println("index of Max = " + indexOfMax);
		
		
		
		//Finding an element in an array and its index 
		
		System.out.println("\n\nFinding an element in an array and its index ");
		
		int[] numbers1 = {78 , 89 , 54, 64 ,99 , 12, 100, 102, 109} ;
		
		int numberToFind = 100 ;
		
		int i;
		
		for( i =0 ; i < numbers1.length ; i++) {
			if(numberToFind == numbers1[i]) {
				break;
			}	
		}
		
		System.out.println("index of 100 is :" + i);
		
	}

}


////  
/*

i = 10;

10 >= 1 ----> true ---> for loop execute --> 10
-----------------------------------------
i-- ---> 10-1 --> i= 9
9 >= 1 ---> true --> for loop execute ---> 9


.
.
.

i = 1  
1 >= 1 --> true --> 1

i =0 
0 >=1 --> false --> loop ends here 


*/



//Write a program to print digits of a number 9125  ---> 9 1 2 5   (Hint : Use while loop, / and % )
//Write a program to print square of all elements of an array.
//Write a program to print minimum number in an array.
//Write a program to print all numbers in an array but not print number at index 5.
//Write 
