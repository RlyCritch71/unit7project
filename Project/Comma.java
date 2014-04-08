import java.util.*;

public class Comma
{
    public static void main( String [] args )
    {
        Scanner reader = new Scanner( System.in );
        int num;
        String comma, again;
        
        do
        {
            System.out.println( "Enter number you wish to insert commas." );
            num = reader.nextInt( );
            
            comma = insertComma( num );
            System.out.println( "Number with commas: " + comma );
            
            System.out.println( "Would you like to run program again? Enter yes to go again." );
            again = reader.nextLine( );
            again = reader.nextLine( );
        }while( again.equalsIgnoreCase( "yes" ) );
        
        System.out.println( "Thank you. Goodbye." );
    }
    
    public static String insertComma( int n )
    {
        //use modulus and division to break apart
        if( n < 1000 )
        {
            return "" + n;
        }
        else
        {
            return insertComma( n / 1000 ) + "," + ( n % 1000 );
        }
    }
}
