import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Integer n: ");
        int n = scan.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        int fnew = fold1 + fold2;
        
        for (int i = 2; i <= n; i++)
        {
            fold1 = fnew;
            fold2 = fold1;
            fnew = fold1 + fold2;
        }
        
        System.out.println("Fibonacci: "+fnew);
        
    }
}