public class ba555_hw6p1 {


    public static void main(String[] args) {
        // Declare the sizes of arrays that each algorithm will need to sort
        int s_50 = 50000;
        int s_100 = 100000;
        int s_200 = 200000;
        int s_300 = 300000;
        int s_400 = 400000;

        // Declare some resuable variables to store the start and end times and elapsed times
        long start_time;
        long end_time;
        long elapsed_time;

        //================================================================================================
        // Insertion Sort 50K
        InsertionSort obj_ins_sort = new InsertionSort(s_50);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_ins_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Insertion Sort for Array Size: " + s_50);
        System.out.println("Insertion Sort Time: " + elapsed_time);
        System.out.println("Insertion Sort # of Comparisions: " + obj_ins_sort.val_compare);
        System.out.println("Insertion Sort # of Swaps: " + obj_ins_sort.val_swap);
        //================================================================================================
        // Insertion Sort 100K
        obj_ins_sort = new InsertionSort(s_100);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_ins_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Insertion Sort for Array Size: " + s_100);
        System.out.println("Insertion Sort Time: " + elapsed_time);
        System.out.println("Insertion Sort # of Comparisions: " + obj_ins_sort.val_compare);
        System.out.println("Insertion Sort # of Swaps: " + obj_ins_sort.val_swap);
        //================================================================================================
        // Insertion Sort 200K
        obj_ins_sort = new InsertionSort(s_200);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_ins_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Insertion Sort for Array Size: " + s_200);
        System.out.println("Insertion Sort Time: " + elapsed_time);
        System.out.println("Insertion Sort # of Comparisions: " + obj_ins_sort.val_compare);
        System.out.println("Insertion Sort # of Swaps: " + obj_ins_sort.val_swap);
        //================================================================================================
        // Insertion Sort 300K
        obj_ins_sort = new InsertionSort(s_300);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_ins_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Insertion Sort for Array Size: " + s_300);
        System.out.println("Insertion Sort Time: " + elapsed_time);
        System.out.println("Insertion Sort # of Comparisions: " + obj_ins_sort.val_compare);
        System.out.println("Insertion Sort # of Swaps: " + obj_ins_sort.val_swap);
        //================================================================================================
        // Insertion Sort 400K
        obj_ins_sort = new InsertionSort(s_400);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_ins_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Insertion Sort for Array Size: " + s_400);
        System.out.println("Insertion Sort Time: " + elapsed_time);
        System.out.println("Insertion Sort # of Comparisions: " + obj_ins_sort.val_compare);
        System.out.println("Insertion Sort # of Swaps: " + obj_ins_sort.val_swap);
        //================================================================================================






        //================================================================================================
        // Selection Sort 50K
        SelectionSort obj_sel_sort = new SelectionSort(s_50);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_sel_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Selection Sort for Array Size: " + s_50);
        System.out.println("Selection Sort Time: " + elapsed_time);
        System.out.println("Selection Sort # of Comparisions: " + obj_sel_sort.val_compare);
        System.out.println("Selection Sort # of Swaps: " + obj_sel_sort.val_swap);
        //================================================================================================
        // Selection Sort 100K
        obj_sel_sort = new SelectionSort(s_100);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_sel_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Selection Sort for Array Size: " + s_100);
        System.out.println("Selection Sort Time: " + elapsed_time);
        System.out.println("Selection Sort # of Comparisions: " + obj_sel_sort.val_compare);
        System.out.println("Selection Sort # of Swaps: " + obj_sel_sort.val_swap);
        //================================================================================================
        // Selection Sort 200K
        obj_sel_sort = new SelectionSort(s_200);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_sel_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Selection Sort for Array Size: " + s_200);
        System.out.println("Selection Sort Time: " + elapsed_time);
        System.out.println("Selection Sort # of Comparisions: " + obj_sel_sort.val_compare);
        System.out.println("Selection Sort # of Swaps: " + obj_sel_sort.val_swap);
        //================================================================================================
        // Selection Sort 300K
        obj_sel_sort = new SelectionSort(s_300);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_sel_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Selection Sort for Array Size: " + s_300);
        System.out.println("Selection Sort Time: " + elapsed_time);
        System.out.println("Selection Sort # of Comparisions: " + obj_sel_sort.val_compare);
        System.out.println("Selection Sort # of Swaps: " + obj_sel_sort.val_swap);
        //================================================================================================
        // Selection Sort 400K
        obj_sel_sort = new SelectionSort(s_400);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_sel_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Selection Sort for Array Size: " + s_400);
        System.out.println("Selection Sort Time: " + elapsed_time);
        System.out.println("Selection Sort # of Comparisions: " + obj_sel_sort.val_compare);
        System.out.println("Selection Sort # of Swaps: " + obj_sel_sort.val_swap);







        //================================================================================================
        // Merge Sort 50k
        MergeSort obj_mer_sort = new MergeSort(s_50);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_mer_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Merge Sort for Array Size: " + s_50);
        System.out.println("Merge Sort Time: " + elapsed_time);
        System.out.println("Merge Sort # of Comparisions: " + obj_mer_sort.val_compare);
        System.out.println("Merge Sort # of Swaps: " + obj_mer_sort.val_swap);
        //================================================================================================
        // Merge Sort 100k
        obj_mer_sort = new MergeSort(s_100);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_mer_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Merge Sort for Array Size: " + s_100);
        System.out.println("Merge Sort Time: " + elapsed_time);
        System.out.println("Merge Sort # of Comparisions: " + obj_mer_sort.val_compare);
        System.out.println("Merge Sort # of Swaps: " + obj_mer_sort.val_swap);
        //================================================================================================
        // Merge Sort 200k
        obj_mer_sort = new MergeSort(s_200);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_mer_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Merge Sort for Array Size: " + s_200);
        System.out.println("Merge Sort Time: " + elapsed_time);
        System.out.println("Merge Sort # of Comparisions: " + obj_mer_sort.val_compare);
        System.out.println("Merge Sort # of Swaps: " + obj_mer_sort.val_swap);
        //================================================================================================
        // Merge Sort 300k
        obj_mer_sort = new MergeSort(s_300);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_mer_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Merge Sort for Array Size: " + s_300);
        System.out.println("Merge Sort Time: " + elapsed_time);
        System.out.println("Merge Sort # of Comparisions: " + obj_mer_sort.val_compare);
        System.out.println("Merge Sort # of Swaps: " + obj_mer_sort.val_swap);
        //================================================================================================
        // Merge Sort 400k
        obj_mer_sort = new MergeSort(s_400);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_mer_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Merge Sort for Array Size: " + s_400);
        System.out.println("Merge Sort Time: " + elapsed_time);
        System.out.println("Merge Sort # of Comparisions: " + obj_mer_sort.val_compare);
        System.out.println("Merge Sort # of Swaps: " + obj_mer_sort.val_swap);




        //================================================================================================
        // Quick Sort 50k
        QuickSort obj_qui_sort = new QuickSort(s_50);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_qui_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Quick Sort for Array Size: " + s_50);
        System.out.println("Quick Sort Time: " + elapsed_time);
        System.out.println("Quick Sort # of Comparisions: " + obj_qui_sort.val_compare);
        System.out.println("Quick Sort # of Swaps: " + obj_qui_sort.val_swap);
        //================================================================================================
        // Quick Sort 100k
        obj_qui_sort = new QuickSort(s_100);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_qui_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Quick Sort for Array Size: " + s_100);
        System.out.println("Quick Sort Time: " + elapsed_time);
        System.out.println("Quick Sort # of Comparisions: " + obj_qui_sort.val_compare);
        System.out.println("Quick Sort # of Swaps: " + obj_qui_sort.val_swap);
        //================================================================================================
        // Quick Sort 200K
        obj_qui_sort = new QuickSort(s_200);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_qui_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Quick Sort for Array Size: " + s_200);
        System.out.println("Quick Sort Time: " + elapsed_time);
        System.out.println("Quick Sort # of Comparisions: " + obj_qui_sort.val_compare);
        System.out.println("Quick Sort # of Swaps: " + obj_qui_sort.val_swap);
        //================================================================================================
        // Quick Sort 300k
        obj_qui_sort = new QuickSort(s_50);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_qui_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Quick Sort for Array Size: " + s_300);
        System.out.println("Quick Sort Time: " + elapsed_time);
        System.out.println("Quick Sort # of Comparisions: " + obj_qui_sort.val_compare);
        System.out.println("Quick Sort # of Swaps: " + obj_qui_sort.val_swap);
        //================================================================================================
        // Quick Sort 400k
        obj_qui_sort = new QuickSort(s_400);
        // Get time before sort
        start_time = System.currentTimeMillis();
        // Perform the sort
        obj_qui_sort.sort();
        // Get the end time
        end_time = System.currentTimeMillis();
        // Compute elapsed time
        elapsed_time = end_time - start_time;
        // Output the information
        System.out.println("Quick Sort for Array Size: " + s_400);
        System.out.println("Quick Sort Time: " + elapsed_time);
        System.out.println("Quick Sort # of Comparisions: " + obj_qui_sort.val_compare);
        System.out.println("Quick Sort # of Swaps: " + obj_qui_sort.val_swap);

    }

    
}