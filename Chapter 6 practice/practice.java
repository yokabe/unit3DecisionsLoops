public class practice
{
    public static void main(String[] args)
    {
        int s = 0;
        int j = 1;
        while (j <= 10)
        {
            s = s + j;
            j++;
        }
        System.out.println(s);
        
        s = 0;
        
        for (int i = 1; i <= 10; i++)
        {
            s = s + i;
        }
        System.out.println(s);
        
        
        
        for (int i = 1; i <= 2; i++)
        {
            for (int a = 1; a <= 4; a++)
            {
                System.out.print(i);
                System.out.println(a);
            }
        }
        
        int c = 1;
        int d = 1;
        while (c <= 2)
        {
            d = 1;
            while (d <= 4)
            {
                System.out.print(c);
                System.out.println(d);
                d++;
            }
            c++;
        }
        
        int e = 1;
        int f = 1;
        
        do
        {
            f=1;
            
            do
            {
                
                System.out.print(e);
                System.out.println(f);
                f++;
                
            }
            while (f <= 4);
            e++;
        } 
        while (e <= 2);
        
    }
}

   
