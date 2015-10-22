import java.util.Scanner;

public class Epsilon
{
    public static final double EPSILON = 1e-12;
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double i = scanner.nextDouble();
        
        String adj = "";
        if (Math.abs(i) < 1.0)
        {
            adj = "small";
        }
        else if (Math.abs(i) > 1000000)
        {
            adj = "large";
        }
        
        if (Math.abs(i-0) < EPSILON)
        {
            System.out.println("It's a zero");
        }
        else if(i > 0)
        {
            System.out.println( "It's as " + adj + " positive number");
        }
        else
        {
            System.out.println( "It's a " + adj + " negative number");
        }
    }
}