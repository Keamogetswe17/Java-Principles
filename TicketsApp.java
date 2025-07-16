/*

NEO KEAMOGETSWE NOANA
223098576
GROUP OA(PPG115D)
Ms.W.Birch

*/
import java.util.Scanner;

public class TicketsApp
{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("How many tickets would you like");
int tickets = sc.nextInt();

totalPrice(tickets,125,100,90);



}//end of main

public static int totalPrice(int tickets, int price1,int special1, int special2)
{
	int cost;
	
	if(tickets<=4)
	{
		System.out.println("The price is R125 per ticket");
		cost = tickets*price1;
		System.out.println(cost);
	}
	if(tickets<=24)
	{
		System.out.println("The price is R100 per ticket");
		cost = tickets*special1;
		System.out.println(cost);
		
	}
	else{
		System.out.println("The price is R90 per ticket ");
		cost = tickets*special2;
		System.out.println(cost);
		}
	
	return cost;

}//end of TOTALPRICE 

}//end of class