/*

NEO KEAMOGETSWE NOANA
223098576
GROUP OA(PPG115D)
Ms.W.Birch

*/

import java.util.Scanner;

public class MonthlySalary
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter your Annual Wage");
double annualPay = sc.nextDouble();


double salary = calcMonthly(annualPay);
	
displaySalary( salary);	
	
	
	

}//end of main

public static double calcMonthly(double annualPay)
{
	double salary = annualPay/12;
	
	return salary;
}//end of calcMonthly

public static void displaySalary(double salary)
{
	System.out.println(salary);
}

}//end of class