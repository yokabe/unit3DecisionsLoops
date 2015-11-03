import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Width: ");
        int sideWidth = scanner.nextInt();
        int a = (sideWidth*2) - 1;
        int b = 1;
        while (a >= b)
        {
            
            
            for (int e = a*2; b <=e; e-=2)
            {
                System.out.print(" ");
            }
            
            for (int c = 1; b >= c; c++)
            {
               if (b == c)
                {
                    System.out.println("*");
                }
                else
                {
                    System.out.print("*");
                }
            }
            b += 2;
        }
        int d = a - 2;
        while (d >= 1)
        {
            for (int e = a*2; d <=e; e-=2)
            {
                System.out.print(" ");
            }
            for (int c = 1; d >= c; c++)
            {
               if (d == c)
                {
                    System.out.println("*");
                }
                else
                {
                    System.out.print("*");
                }
            }
            d -= 2;
        }
    }
}
