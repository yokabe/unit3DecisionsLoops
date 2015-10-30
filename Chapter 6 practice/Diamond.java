import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Width: ");
        int sideWidth = scanner.nextInt();
        int a = 0;
        
        for (int i = 1; i < sideWidth; i+=2)
        {
            System.out.println("*");
            a = 0;
            while (a <= i)
            {
                System.out.print("*");
                a +=1;
            }
           
        }
    }
}
