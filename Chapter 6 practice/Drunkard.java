import java.util.Random;

public class Drunkard
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int x = 0;
        int y = 0;
        int n = 0;
        for (int i = 0; i < 100; i++)
        {
            n = rand.nextInt(5);
            if (n == 0)
            {
                x += 1;
            }
            else if (n == 1)
            {
                x -= 1;
            }
            else if (n == 2)
            {
                y += 1;
            }
            else
            {
                y -= 1;
            }
        }
        
        System.out.println("Position of drunkard: ("+x+", "+y+")");
    }
}