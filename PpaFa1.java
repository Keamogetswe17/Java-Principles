import java.util.Scanner;


public class PpaFa1
{
	
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your childs Details to find out what description they hacve for your child");

System.out.println("Enter Name:");
String name= sc.next();

System.out.println("Enter Age:");
String age = sc.next();

System.out.println("Enter Grade:");
char grade = sc.next().charAt(0);


String descriptionz=null;

if(grade=='R'||grade=='1'||grade=='2'||grade=='3')
{
	descriptionz="FOUNDATION PHASE";
	System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Grade:"+grade+"\n"+"Your child is decribed as a learner of:"+descriptionz);
	
}
else if(grade=='4'||grade=='5'||grade=='6'||grade=='7')
{
	descriptionz="Intermediate PHASE";
	System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Grade:"+grade+"\n"+"Your child is decribed as a learner of:"+descriptionz);

}else if(grade=='8'||grade=='9'||grade=='10'||grade=='11'||grade=='12')
{
	descriptionz="High School";
	System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Grade:"+grade+"\n"+"Your child is decribed as a learner of:"+descriptionz);
	
}
else{
	descriptionz="INVALID GRADE";
	System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Grade:"+grade+"\n"+"Your child is decribed as a learner of:"+descriptionz);
	
}


}


}


/*
1.1  Both the for-loop and while loop are examples of a pre-test loop.  
TRUE

1.2  A block statement is sequence of Java statements enclosed between braces, 
{ and}. TRUE

 
1.3  If one of the conditions in an AND logic is false then the result will be false. 
TRUE
 
1.4  The following is the correct expression to evaluate to true if the number num is between 5 
and 500 or the number is negative? 
TRUE
 
1.5  The following code is a valid code to display a square root of a number using the Math class. 
System.out.println(Math.sqrt(49.0));
FALSE
 
1.6 The following statements are equivalent. finalAmmount=finalAmount+1 / finalAmount++
True
 
1.7 A counter control loop without an update statement will always result into a syntax error. 
true

1.8 In a switch statement in Java, the default keyword is optional. 
false

1.9 In a while loop, the code executes as long as the condition is false.  
false
 
1.10 Only if statements are nested in Java, but loops or iteration control structure cannot be 
nested. 
false

*/