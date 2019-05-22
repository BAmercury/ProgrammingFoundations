
import java.util.Random;

public class MergeSort {
   // Declare variable to hold number of exchanges
   // Make public so we can access this count after the algorithm is completed
   public Long val_swap = 0L;
   // Declare public variable to hold number of comparisions
   public Long val_compare = 0L;
   private int[] data;
   private static final Random generator = new Random();

   public MergeSort( int size ) {
      data = new int[ size ];

      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }
   

   // call this method from main program
   public void sort() {
      sortArray( 0, data.length - 1 );
   }


   private void sortArray( int low, int high ) 
   {
      if ( ( high - low ) >= 1 ) {
         int middle1 = ( low + high ) / 2; 
         int middle2 = middle1 + 1;

         sortArray( low, middle1 ); 
         sortArray( middle2, high );

         merge ( low, middle1, middle2, high );
      }
   } 

   
   private void merge( int left, int middle1, int middle2, int right ) 
   {
      int leftIndex = left; 
      int rightIndex = middle2;
      int combinedIndex = left;
      int[] combined = new int[ data.length ];
      
      while ( leftIndex <= middle1 && rightIndex <= right ) {
         if ( data[ leftIndex ] <= data[ rightIndex ] )
            combined[ combinedIndex++ ] = data[ leftIndex++ ]; 
         else 
            combined[ combinedIndex++ ] = data[ rightIndex++ ];
            // Swap has been made
            //val_swap += middle1 - leftIndex + 1;
            val_swap++;
         // Comparision made
         val_compare++;
      }
   
      if ( leftIndex == middle2 )
         while ( rightIndex <= right )
            combined[ combinedIndex++ ] = data[ rightIndex++ ];
      else
         while ( leftIndex <= middle1 ) 
            combined[ combinedIndex++ ] = data[ leftIndex++ ];      

      for ( int i = left; i <= right; i++ )
         data[ i ] = combined[ i ];
   } 
  
}


