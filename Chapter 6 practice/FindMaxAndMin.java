import java.util.Scanner;
public class FindMaxAndMin
{
    public static double findMax()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of number or any character to quit: ");
        
        double largest = scan.nextDouble();
        while (scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if (input > largest)
            {
                largest = input;
            }
        }
        
        return largest;
    }
}