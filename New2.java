import java.util.Scanner;
import java.text.DecimalFormat;

public class New2{


public static void main(String [] args)
{

Scanner sc = new Scanner(System.in);
DecimalFormat df = new DecimalFormat("0.00");

double radius=0.00, height=0.00,area=0.00,volume=0.00;
final double PI=3.14;

System.out.println("Enter your radius");
radius= sc.nextDouble();

System.out.println("Enter the height");
height= sc.nextDouble();


area = 2 * PI * radius * height ;
volume = PI *( radius*radius )* height;

System.out.println(area);
System.out.println(volume);

double sum =5/2;
System.out.println(sum);
}


}