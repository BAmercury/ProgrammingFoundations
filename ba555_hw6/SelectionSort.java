
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
   // Declare variable to hold number of exchanges
   // Make public so we can access this count after the algorithm is completed
   public Long val_swap = 0L;
   // Declare public variable to hold number of comparisions
   public Long val_compare = 0L;

   private int[] data;
   private static final Random generator = new Random();

   public SelectionSort( int size ) {
      data = new int[ size ];

      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }


   // call this method from main program
   public void sort() {
      int smallest;

      for ( int i = 0; i < data.length - 1; i++ ) {
         smallest = i;

         for ( int index = i + 1; index < data.length; index++ )
            if ( data[ index ] < data[ smallest ] ) {
               // Comparision has been made
               val_compare++;
               smallest = index;
            }


         swap( i, smallest ); 
      }
   }

   public void swap( int first, int second ) {
      int temporary = data[ first ]; 
      data[ first ] = data[ second ]; 
      data[ second ] = temporary;
      // When this function is called, a swap is performed
      val_swap++;
   }
}

