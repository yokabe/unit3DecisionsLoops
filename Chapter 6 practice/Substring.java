//unfinished
import java.util.Scanner;
public class Substring
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.next();
        
        int len = string.length();
        
        for (int i = 0; i < string.length(); i++)
        {
            System.out.println(string.charAt(i));
            
        }
        for (int b = 1; b < (string.length()-1); b++)
        {
                System.out.println(string.substring(-1+b, 1+b));
            }
        for (int a = 0; a < string.length()-2; a++)
        {
            
            System.out.println(string.substring(0+a, 3+a));
        }
        for (int c = 0; c < string.length()-3; c++)
        {
            System.out.println(string.substring(0+c, 4+c));
        }
        
        System.out.println(string);
        
    }
}