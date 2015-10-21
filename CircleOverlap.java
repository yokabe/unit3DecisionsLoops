import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;

      // Your work goes here
      
      if (Math.pow(radius1-radius2, 2)<= Math.pow(xcenter1-xcenter2, 2)+Math.pow(ycenter1-ycenter2, 2)
      && Math.pow(xcenter1-xcenter2, 2)+Math.pow(ycenter1-ycenter2, 2) <= Math.pow(radius1+radius2, 2))
      {
        System.out.println("Circles overlap");  
        }
        else
        {
            if ((radius1+radius2 > 80)
            {
                System.out.println("Circles are mutually contained");
            }
            else
            {
                System.out.println("Circles are disjoint");
            }
        }
   }
}