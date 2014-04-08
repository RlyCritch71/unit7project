import java.util.*;

public class Puzzle
{
    public static void main( String [] args )
    {
        Scanner reader = new Scanner( System.in );
        int [] set;
        int size, num;
        boolean bool;
        
        do
        {
            System.out.println( "What size is the array?" );
            size = reader.nextInt( );
            
            set = new int [size];
            
            System.out.println( "Fill array with data, numbers 1 - 9, last one must be 0" );
            for( int x = 0; x < set.length; x++ )
            {
                num = reader.nextInt( );
                set[x] = num;
            }
            
            bool = solve( set );
            
            if( bool )
            {
                System.out.println( "Puzzle was solved." );
            }
            else
            {
                System.out.println( "Puzzle was not solved." );
            }
            
            
            
        }
    }
}
        