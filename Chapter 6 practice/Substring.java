
import java.util.Scanner;
public class Substring
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.next();
        
        for (int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
            
        }
        for (int b = 0; b < (string.length()-1); b++)
            {
                System.out.println(string.substring(0+b, 2+b));
            }
        for (int a = 2; a < string.length(); a++)
        {
            
            System.out.println(string.substring(string.length() - a , string.length()));
        }
        System.out.println(string);
        
    }
}