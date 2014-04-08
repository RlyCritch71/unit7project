import java.util.*; 
public class GreatestCommonDivisor
{
    public static void main( String [] args )
    {
        Scanner reader = new Scanner( System.in );
        int num1, num2, greatestCD;
        String again;
        
        do
        {
            System.out.println( "Enter two numbers that you would like to find the GCD of." );
            num1 = reader.nextInt( );
            num2 = reader.nextInt( );
            
            greatestCD = GCD( num1, num2 );
            System.out.println( "The GCD is: " + greatestCD );
            
            System.out.println( "Would you like to run the program again? Enter yes to go again." );
            again = reader.nextLine( );
            again = reader.nextLine( );
        }while( again.equalsIgnoreCase( "yes" ) );
        System.out.println( "Thank you. Goodbye." );
    }
    
    public static int GCD( int a, int b )
    {
        if( a == 0 || b == 0 )
        {
            return a;
        }
        else
        {
            return GCD( b, a%b );
        }
    }
}