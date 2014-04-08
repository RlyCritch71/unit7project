import java.util.*;
public class Reverse
{
    public static void main( String [] args )
    {
        Scanner reader = new Scanner( System.in );
        String word, rWord, again;
        
        do
        {
            System.out.println( "Enter word you would like to reverse." );
            word = reader.nextLine( );
            
            rWord = reverseIt( word.length( ), word );
            System.out.println( "Reversed word: " + rWord );
            
            System.out.println( "Would you like to reverse another word? Enter yes to go again." );
            again = reader.nextLine( );
        }while( again.equalsIgnoreCase( "yes" ) );
        
        System.out.println( "Thank you. Goodbye." );
    }
    
    public static String reverseIt( int pos, String s )
    {
        if( pos > 0 )
        {
            char ch = s.charAt( 0 );
            String p = s.substring( 1 );
            String rev = reverseIt( p.length( ) , p ) + ch;
            return rev;
        }
        else
        {
            return " ";
        }
    }
}
