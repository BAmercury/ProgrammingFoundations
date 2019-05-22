import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

   // Declare variable to hold number of exchanges
   // Make public so we can access this count after the algorithm is completed
   public Long val_swap = 0L;
   // Declare public variable to hold number of comparisions
   public Long val_compare = 0L;

   private int[] data;
   private static final Random generator = new Random();

   public InsertionSort( int size ) {
      data = new int[ size ];

      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }

   // call this method from main program
   public void sort(){
      int insert;
      // Iterate through each index of the given array
      for ( int next = 1; next < data.length; next++ ) {
         // Pop second variable to evaluate at current index
         insert = data[ next ]; 
         // Save the index to a new variable
         int moveItem = next; 
         // Evaluate if the index is greater than 0 and if the value at the previous index
         // is greater than the value at the current index
         while ( moveItem > 0 && data[ moveItem - 1 ] > insert ) {
            // Every starting iteration of while loop a comparision will have been made
            val_compare++;
            // If the comparison is true, we need to insert/swap the value at the previous index
            // into the spot of the current index
            data[ moveItem ] = data[ moveItem - 1 ];
            // Count the swap performed
            val_swap++;
            // Decrement the index and evaluate again (Working backwards)
            moveItem--;
         }
         data[ moveItem ] = insert;
      } 
   }
}


