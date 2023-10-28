
public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int[] numbers = {100,202,505,67,98,45,78,46,12,13};
		
		System.out.println("The array is having : " + numbers.length + " elements");
		
		// loops
		int i = 0;
		
		while(i < numbers.length) {
			System.out.println(numbers[i]);      //------> numbers[0], numbers[1] , numbers[2]
			if(numbers[i] == 202) {
				break;
			}
			i++ ;
		}
		
		System.out.println("End of program");
		
	}

}

/// Write a program to print all the numbers till 15.
/// Write a program to print all the even numbers only between 1 to 100.
//  Create an array of size 10. Add elements to it. Using while loop add 10 to each element value. And finally using another while loop print the array.
