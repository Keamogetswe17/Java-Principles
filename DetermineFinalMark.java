import java.util.Scanner;



public class DetermineFinalMark
{
	
public static void main(String [] args)
{
	
	Scanner sc = new Scanner(System.in);
	
	double mark1, mark2,mark3;
	double finalMark, testAve, examMark;
	String name;
	
	
	
	for(int i=1;i<20;i++)
	{
		
	System.out.println("Enter your Name:");
	name = sc.nextLine();
	
	System.out.println("Enter your first mark for student"+i+":");
	mark1 = sc.nextDouble();
	
	System.out.println("Enter your second markfor student"+i+":");
	mark2 = sc.nextDouble();
	
	System.out.println("Enter your third  mark for student"+i+":");
	mark3 = sc.nextDouble();
	
	System.out.println("Enter your examMark mark for student"+i+":");
	examMark = sc.nextDouble();
	
	testAve = ((mark1 + mark2 + mark3)/3);
	finalMark = ((testAve)/2+(examMark)/2);
	
	System.out.println("The final mark for student"+i+":"+finalMark);
		
	}//end of loop
	
}//end of main

}//end of class