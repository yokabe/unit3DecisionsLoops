



public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";

        /*
         * Write the following conditions in Java:
         * 
         * 1) word1 is lexicographically greater than "aaa"
         * 2) word1 is lexicographically equal to word2
         * 3) word1 is lexicographically less than word2 
         * 4) word1 and word2 have the same three-letter prefix
         */
        if( word1.compareTo("aaa") > 0 )
        {
            System.out.println("condition 1 satisfied!");
        }

        if( word1.equals(word2))
        {
            System.out.println("condition 2 satisfied!");
        }

        if( word1.compareTo(word2) < 0 )
        {
            System.out.println("condition 3 satisfied!");
        }

        String word1Prefix = word1.substring(0, 3);
        String word2Prefix = word2.substring(0, 3);
        if( word1Prefix.equals(word2Prefix))
        {
            System.out.println("condition 4 satisfied!");
        }
    }

}
