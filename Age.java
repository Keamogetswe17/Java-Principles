import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class Age
{
	public static void main(String[] args)
	{
		
		int age;
		String name;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Random rand = new Random();
		
		double guessed,generated;
		
System.out.println("Please enter your name:");
name = sc.nextLine();

System.out.println("Please enter your age:");	
age = sc.nextInt();

if(age>=60)
{
	System.out.println("You are an elder");
}	
		else if(age<60 && age>=35)
		{
			System.out.println("you are an adult");
		}
		else if(age<35 && age>=16)
		{
			System.out.println("you are youth");
		}
		else if(age<=15)
		{
			System.out.println("you are a kid");
	}
	else
	{
		System.out.println("Error");
	}
	
	
	System.out.println("Guess the correct number between 1-50");
	guessed = sc.nextDouble();
	
	
	
	generated = rand.nextDouble((50)+1);
	
	
	if(guessed == generated)
	{
		System.out.println("you have won");
	}
	else
	{
		System.out.println("You have lost");
	}
	
	System.out.println("the winning number is" + df.format(generated));
	System.out.println("the number you chose is" + df.format(guessed));
	
	
	}// end of main
}// end of class