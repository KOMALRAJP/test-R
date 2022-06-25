import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// In the Fibonacci Series, a number of the series is obtained by adding the last two numbers of the series.

		int FibLength;
		
	/*	Scanner sc = new Scanner(System.in); //create object

		
		System.out.print("Please enter length: ");
		 
		FibLength = sc.nextInt();

		
		int num[]  = new int[FibLength];
		
		//initialized first element to 0
		
		num[0] = 0;
		
		//initialized second element to 1
		 
		num[1] = 1;
		  
		  //New number should be the sum of the last two numbers of the series.
		
		for (int i = 2; i < FibLength; i++) {
		
			num[i] = num[i - 1] + num[i - 2];
			
		  }

		  //Print Fibonacci Series
		
		System.out.println("Fibonacci Series: ");
		
		for (int i = 0; i < FibLength; i++) {
		
			System.out.print(num[i] + " ");
		  }
	*/
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
				
			
		}
		
		
	}
}
