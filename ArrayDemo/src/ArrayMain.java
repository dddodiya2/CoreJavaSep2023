import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		
		//System.out.println(args[0]);
		
		/*
		//ways of declaring an array :
		int[] a ;
		int []b;
		int c[];
	
		
		
		//Construction 
		a = new int[5];       // valid
		//b = new int[] ;     // Not valid --->
		//b = new int[-5];    // Not valid - NegativeArraySizeException     
		b = new int[0];       //  valid but not useful
		b = new int['x'];     // valid   'x' ---> Char --> ASCII value --> 90 --> new int[90];
		//b = new int[2147483640];   // valid max size
		//b = new int[ (int) 2147483648L];   // valid max size
		b = new int[ (int) 10L ];
//		b = new int[10L];   NOT ALLOWED
		
		
		String[] names = { "Prachi" , "Dhanshree" , "Archana"  } ; 
		
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		*/
		
		String[] names2 = new String[] {"Prachi" , "Dhanshree" , "Archana" } ;
		System.out.println(names2[0]);
		System.out.println(names2[1]);
		System.out.println(names2[2]);
		
		
		System.out.println("Pura array ekbar me print");
		System.out.println(Arrays.toString(names2));
		names2[0] = "Krishna";
		names2[1] = "Priyanka";
		
		System.out.println("Pura array ekbar me print, dusri bar");
		System.out.println(Arrays.toString(names2));
		
		//ArrayIndexOutOfBoundsException 
		//names2[3] = "Divyesh";
		//System.out.println(names2[3]);
		
		System.out.println("Pura array ekbar me print, tisri bar");
		System.out.println(Arrays.toString(names2));
		
		/*
			String[] names1 = new String[3] ;
			names1 = { "Prachi" , "Dhanshree" , "Archana"  } ; 
		
			String[] names1  ;
			names1 = { "Prachi" , "Dhanshree" , "Archana"  } ; 
		
		
		
		int[] a0 = new int[4];
		a0[0]  = 00 ;
		a0[1]  = 01 ;
		a0[2]  = 02 ;
		a0[3]  = 03 ;
		
		int[] a1 = {10, 11, 12 , 13} ;		
		int[] a2 = {20, 21, 22 , 23} ;
		int[] a3 = {30, 31, 32 , 33} ;
		
  		int[][] A = new int[4][4];
  		
  		A[0] = a0;
  		A[1] = a1;
  		A[2] = a2;
  		A[3] = a3;
  		
  		
  		
  		
  		
  		
  		int[][] AB = new int[2][];
  		
  		AB[0]  = new int[4];
  		AB[1]  = new int[100];
  		
  		
  		
  		int[] sampleArray = new int[6];
  		int[] sampleArray1 = {1,2,2,3,3,3,3,3,3,3,3,20,0,0,0,0,0,0};
  		
  		System.out.println("sampleArray  " + sampleArray.length  );
  		System.out.println("sampleArray1  " + sampleArray1.length  );
  		
  		System.out.println("sampleArray  : " + sampleArray[0]  );
  		System.out.println("sampleArray  : " + sampleArray[1]  );
  		System.out.println("sampleArray  : " + sampleArray[2]  );
  		System.out.println("sampleArray  : " + sampleArray[3]  );
  		System.out.println("sampleArray  : " + sampleArray[4]  );
  		System.out.println("sampleArray  : " + sampleArray[5]  );
  		
  		
  		
  		int[][] sample2dArray = {  {54,87,99}   ,  {56,87,32}  , {36,57,47,54}  };
  		
  		System.out.println("sample2dArray  : " + sample2dArray[0][0]  );
  		System.out.println("sample2dArray  : " + sample2dArray[0][1]  );
  		System.out.println("sample2dArray  : " + sample2dArray[0][2]  );
  		System.out.println("sample2dArray  : " + sample2dArray[1][0]  );
  		System.out.println("sample2dArray  : " + sample2dArray[1][1]  );
  		System.out.println("sample2dArray  : " + sample2dArray[1][2]  );
  		System.out.println("sample2dArray  : " + sample2dArray[2][0]  );
  		System.out.println("sample2dArray  : " + sample2dArray[2][1]  );
  		System.out.println("sample2dArray  : " + sample2dArray[2][2]  );
  		System.out.println("sample2dArray  : " + sample2dArray[2][3]  );
  		
  		
  		
  		int[][][] B = new int[3][2][4];
  		
  		System.out.println("B length : " + B.length );  // 3 B[0] , B[1]  , B[2]   
  		System.out.println("B[0] length : " + B[0].length );   // 2
  		
  		System.out.println("B[1][0] length : " + B[1][0].length );   //   4
  		
  		System.out.println("B[1][0][2] element : " + B[1][0][2] );   //   0
  		
  		
  	
  		
  		*/
  		
		
		
		
	}

}
