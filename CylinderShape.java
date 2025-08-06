/*

NEO KEAMOGETSWE NOANA


*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CylinderShape
{

public static void main(String[] args)
{
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	
	System.out.println("Enter the height");
	double height = sc.nextDouble();
	
	System.out.println("Enter the radius of the base");
	double radius = sc.nextDouble();
	
	System.out.println("What type of calculation would you like to display"+"\n"+"A/a for Area"+"\n"+"V/v for Volume");
	char typeCal = sc.next().charAt(0);
	
	double volume = calcVolume(height,radius);
	double area = calcArea(height, radius);
	
	do
	{
	switch(typeCal)
	{
		case 'v':
		case 'V':
				volume = calcVolume(height,radius);
				displayValues( height,  radius, area, volume, typeCal);
				
		break;
	
	case 'A':
	case 'a':
	
	area = calcArea(height, radius);
	displayValues( height,  radius, area, volume, typeCal);
	break;
	
	
	default:
	}//end of switch
	
	
	System.out.println("What type of calculation would you like to display"+"\n+"+"A/a for Area"+"\n"+"V/v for Volume");
	typeCal = sc.next().charAt(0);
	
	}while( typeCal =='v' || typeCal=='V'&&(typeCal=='A'||typeCal=='a'));
		//end of loop
	
	
	
	
}//end of main

public static double calcVolume(double height, double radius)
{
	double volume = Math.PI*(radius*radius)*height;
	return volume;
	
}//end of calcVolume

public static double calcArea(double height, double radius )
{
	double area = (2*Math.PI*height)+(2*Math.PI*(radius*radius));
	
	return area;
}//end of calcArea

public static void displayValues(double height, double radius, double area, double volume, char typeCal)
{
	
	
	if(typeCal=='v' || typeCal=='v')
	{
	System.out.println("volume of the cylinder with a"+height+"height and radius of"+radius+"="+volume);
	}
	else if(typeCal=='A'|| typeCal=='a')
	{
	System.out.println("Area of cylinder with"+height+"height and radius of"+radius+"="+area);
	}else{}
	
}//end of displayValues

	
	

}//end of class
