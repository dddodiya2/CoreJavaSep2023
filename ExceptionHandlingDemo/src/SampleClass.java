
public class SampleClass {
	
	
	public void doArrayDemo() {

		System.out.println("doArrayDemo started");
		int[] numbers = new int[5];
		
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[3] = 400;
		numbers[4] = 500;
		
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		
		try {
			System.out.println(numbers[4]);
			System.out.println("Helllo from last line of try block");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("There was some exception so we wil ignre and continue");
		} finally {
			System.out.println("This will always be executed, excpetion or no exception !");
		}
		
		System.out.println("doArrayDemo ended");
	}

}
