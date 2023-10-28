
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Black   VIBGYOR   ---- Black
		int number = 1;
		
		switch(number) {
			case 1 :
			{
				System.out.println("Violet");
				break;
			}
			case 2 :
			{
				System.out.println("Indigo");
				break;
			}
			case 3:
			{
				System.out.println("Blue");
				break;
			}
			case 4 :
			{
				System.out.println("Green");
				break;
			}
			case 5 :
			{
				System.out.println("Yellow");
				break;
			}
			case 6 :
			{
				System.out.println("Orange");
				break;
			}
			case 7:
			{
				System.out.println("Red");
				break;
			}
			default :
			{
				System.out.println("Black");
				break;
			}		
		}
		
		
		
	}

}


//define a String which takes color as input and write a program that prints number corresponding to the color using switch case