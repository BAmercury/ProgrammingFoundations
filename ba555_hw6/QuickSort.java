
import java.util.Random;

public class QuickSort {
   // Declare variable to hold number of exchanges
   // Make public so we can access this count after the algorithm is completed
   public Long val_swap = 0L;
   // Declare public variable to hold number of comparisions
   public Long val_compare = 0L;
   private int[] data; 
   private static Random generator = new Random();

   public QuickSort( int size ) {
      data = new int[ size ]; // create space for array

      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }

   // call this method from the main program
   public void sort() {
      quickSortHelper( 0, data.length - 1 );      
   }

   private void quickSortHelper( int left, int right ) {
      int pivot = partition( left, right );

      if ( left < pivot - 1 ) 
         quickSortHelper( left, pivot - 1 );

      if ( pivot + 1 < right ) 
         quickSortHelper( pivot + 1, right ); 
   }

   private int partition( int left, int right ) {
      int pivot = left;

      while ( true ) {
         while ( data[ right ] >= data[ pivot ] ) {
            if ( right == pivot )
               return pivot;
            // Comparision was made
            val_compare++;

            --right;
         }

         swap( pivot, right );

         pivot = right--;

         while ( data[ left ] <= data[ pivot ] ) {
            if ( left == pivot )
               return pivot;
            // Comparision was made
            val_compare++;
            ++left;
         }

         swap( pivot, left );
         pivot = left++; 
      }
   }

   private void swap( int first, int second ) {
      int temporary = data[ first ];
      data[ first ] = data[ second ];
      data[ second ] = temporary;
      // Swap has been made if this function was called
      val_swap++;
   }
}
