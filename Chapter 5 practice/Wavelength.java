import java.util.Scanner;

public class Wavelength
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a wavelength: ");
        double wave = in.nextDouble();
        System.out.println(wave);
        if (wave > 1e-1)
        {
            System.out.println("Radio waves");
        }
        else if (wave <= 1e-1 && wave > 1e-3)
        {
            System.out.println("Microwaves");
        }
        else if (wave <= 1e-3 && wave > 7e-7)
        {
            System.out.println("Infrared");
        }
        else if (wave <= 7e-7 && wave > 4e-7)
        {
            System.out.println("Visible light");
        }
        else if (wave <= 4e-7 && wave > 1e-8)
        {
            System.out.println("Ultraviolet");
        }
        else if (wave <= 1e-8 && wave > 1e-11)
        {
            System.out.println("X-rays");
        }
        else
        {
            System.out.println("Gamma Rays");
        }
    }
}
