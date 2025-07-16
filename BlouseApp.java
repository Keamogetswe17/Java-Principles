import java.util.Scanner;
public class BlouseApp
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the Sale Price");
	double salePrice = sc.nextDouble();
	
	System.out.println(discountCalculate(salePrice,0.25));
}//end of main
	
	public static double discountCalculate(double salePrice, double discount)
	{
	
	double newPrice = salePrice - (salePrice*discount);
	
	return newPrice;
		
	}//end of discountCalculate
	
	
}//end of class