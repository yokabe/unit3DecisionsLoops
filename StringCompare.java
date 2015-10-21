
public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") > 0 )
        {
            System.out.println("Word 1 is lexicorgraphically greater than aaa");
        }
        
        if (word1.equals(word2))
        {
            System.out.println("Word 1 is equal to Word 2");
        }
        else if (word1.compareTo(word2) < 0)
        {
            System.out.println("Word 1 is less than Word 2");
        }
        
        if (word1.substring(0,3).equals(word2))
        {
            System.out.println("Word1 and Word2 have the same 3 letter prefix");
        }
    }
}
