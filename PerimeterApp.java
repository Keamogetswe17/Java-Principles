/*

NEO KEAMOGETSWE NOANA
223098576
GROUP OA(PPG115D)
Ms.W.Birch

*/

import java.util.Scanner;

public class PerimeterApp
{
	public static void main(String [] Args)
	{
		Scanner sc = new Scanner(System.in);
		
		int length, width;
		
		System.out.println("Enter the length");
		length = sc.nextInt();
		
		System.out.println("Enter the width");
		width = sc.nextInt();
		
		System.out.println(calcPeri(length,width));
		
		
	}//end of main
	
	public static int calcPeri(int length,int width)
	{
		int perimeter = length*width;
		
		return perimeter;
	}//END OF METHOD
	
}//end of Class