/*

NEO KEAMOGETSWE NOANA
223098576
GROUP OA(PPG115D)
Ms.W.Birch

*/

import java.util.Scanner;

public class DetermineEven
{
	
	public static void main(String [] args )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numb1");
		int numb1 = sc.nextInt();
		
		System.out.println("Enter numb2");
		int numb2 = sc.nextInt();
		
		int answer = numb1%2 ;
		int answer2 = numb2%2;
		
		
		findEven(answer,answer2);
		
		String results = "BOTH are even";
		
		if(findEven(answer,answer2)==true)
		{
		displayResults(results);
		}else
		{
			System.out.println("Both are not Even numbers");
		}
		
		}//end of main
		
		public static void displayResults(String results)
		{
		System.out.println(results);
		}// end of display Method
	
	public static boolean findEven(int answer,int answer2)
	{
		
	if(answer==0 && answer2==0)
		{
		return true;
		}else
	{
		return false;
	}
	
	}//end of even method
	
	
}//end of class