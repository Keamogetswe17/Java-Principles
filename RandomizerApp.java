/*

NEO KEAMOGETSWE NOANA

*/

import java.util.Random;

public class RandomizerApp 
{
    public static void main(String[] args)
	{
        int value1 = RandomValue();
        int value2 = RandomValue();
        int value3 = RandomValue();

        int highest = determineHighest(value1, value2, value3);
        int lowest = determineLowest(value1, value2, value3);
        
        display(value1, value2, value3, highest, lowest);
    }

    public static void display(int value1, int value2, int value3, int highest, int lowest) {
        System.out.println("Randomized values: " + value1 + ", " + value2 + ", " + value3);
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
    }

    public static int determineHighest(int value1, int value2, int value3)
	{
        return Math.max(Math.max(value1, value2), value3);
    }

    public static int determineLowest(int value1, int value2, int value3)
	{
        return Math.min(Math.min(value1, value2), value3);
    }

    public static int RandomValue() 
	{
        Random random = new Random();
        return random.nextInt((350) + 1);
	
	}

}
