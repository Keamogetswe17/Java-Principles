import java.util.Scanner;

public class MaritalStatus
{
	
public static void main(String[] args)
{
// Create a scanner object
Scanner input = new Scanner(System.in);
 
	String description; 
 
	System.out.print("Enter your marital status:");
	char grade = input.next().charAt(0) ;
 
switch(grade)
{
	case'S':
	case's':
	description = "Single";
break;

case'M':
case'm':
	description = "Married";
break;

case'D':
case'd':
	description = "Divorced";
break;

case'C':
case'c':
	description = "Civil Partnership";
break; 
 
	default:
	description = "Invalid Marital status";

}


System.out.print("Your marital satus is "+ description);
}//end of main
}//end of class