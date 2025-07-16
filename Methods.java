import java.util.Scanner;

public class Methods
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		displaysFullNames("Neo", "Nkoana");
		myMethod();
		displayPrice(1000,0.5);
	 	System.out.println(addition(10,10));
		
		
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		System.out.println(area(3.14,radius));
	}//end of main 
	
	public static void myMethod( )
	{
		System.out.println("HELLO WORLD");
		
	}//end of my method
	
	public static void displaysFullNames(String name, String surname )
	{
	
		String fullNames = name + surname;
		System.out.println(fullNames);
		
	}// end of stringMethod
	
	public static void displayPrice(double salePrice ,double discount)
	{
		double newPrice = salePrice - (salePrice*discount);
		System.out.println(newPrice);
		
	}//end of dispaly price
	
	
	public static int addition(int num1, int num2)
	{
		int sum  =num1 + num2;
		return sum;
	}	
	
	public static double area(double pi, double radius)
	{
		
		double calcArea= 3.14*(radius*radius);
		return calcArea;
	}//END OF AREAMETHOD
	
}//end of class