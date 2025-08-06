/*

NEO KEAMOGETSWE NOANA


*/

import java.util.Scanner;

public class RightAngleApp{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        int angle;
        
        System.out.print("Enter the angle size: ");
        angle = sc.nextInt();
        
        String classification = angleDeterminer(angle);
    }
    
    public static String angleDeterminer(int angleSize){
        
        String classification;
        if(angleSize == 90){
            classification = "The angle is a right angle";
            System.out.println(classification);
        }
        else{
            classification = "The angle is not a right angle";
            System.out.println(classification);
        }
         return classification;    
    }
    

}
