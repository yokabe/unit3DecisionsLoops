import java.util.Scanner;
import java.util.Random;

public class MontyHall
{
    public static void main(String[] args)
    {
        int counter1 = 0;
        int counter2 = 0;
        
        for (int i = 0; i < 1000; i++)
        {
        
            Random random = new Random();
            int car = random.nextInt(3) + 1;
        
        
            int choice = random.nextInt(3) + 1;
        
            int hostChoice = random.nextInt(3) + 1;
            while (hostChoice == car || hostChoice == choice)
            {
                hostChoice = random.nextInt(3) + 1;
            }
        
            int b = random.nextInt(2);
            String n = "";
            if (b==0)
            {
                n = "y";
            }
            else
            {
                n = "n";
            }
            
            if (n == "y")
            {
                int newChoice = random.nextInt(3) + 1;
                while (newChoice == choice || newChoice == hostChoice)
                {
                    newChoice = random.nextInt(3) + 1;
                }
                if (newChoice == car)
                {
                    counter1 += 1;
                   
                }
            }
            else
            {
                if (choice == car)
                {
                    counter2 += 1;
                }
            }
        
        }
        System.out.println("Strategy1: "+counter1);
        System.out.println("Strategy2: "+counter2);
    }
}