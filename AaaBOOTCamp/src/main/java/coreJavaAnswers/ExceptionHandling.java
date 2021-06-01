package coreJavaAnswers;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		// try catch block
		int a=20;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
			
		} 
		catch(Exception e)
		{
			System.out.println("Cannot divide by 0");
		}
		
		// 2 D arrays
		int [][] number= {{10,20,30,50,40},
							{1,2,3,5,4}
				};
		
		System.out.println(number[0][3]+number[1][3]);
	}

}
