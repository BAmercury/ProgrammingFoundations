CS570 Assignment 6
ba555
Bhautik Amin
Drexel ID: 13618816


My submission contains the following files:
    - ba555_hw6p1.java
    - ba555_hw6p2.java
    - MergeSort.java
    - QuickSort.java
    - InsertionSort.java
    - SelectionSort.java


Part 1:

The given sorting algorithm files have been modified to expose public variables that are used to keep track of the number of comaprisions made, as well as number of swaps made. The main driver program sequentially goes through each algorithm and tests it against various loads (varying array sizes). The main driver program runs through the following for each sorting algorithm:
        1. Instantiate a sort object from the given class
        2. Get the star time (milliseconds (ms) )
        3. Begin the sort
        4. Get the end time (ms)
        5. Compute the elapsed time
        6. Print the array size, algorithm type, and time elapsed (In Milliseconds)
        > Repeat for the next array size or repeat cycle for next algorithm
The program tests the algorithms in the following order:
    - InsertionSort
    - Selection Sort
    - Merge Sort
    - Quick Sort





Part 2:

This program revovles around a main program loop. Upon execution the program first prompts the user for input. This is performed using a series of try-catch statements and if-else statements for user input validation. 

The first level of user input validation is the try-catch statement, which aims to see if the user input matches the data type the Java scanner object is expecting. In any case where the data type does not match, the program prints that the input is wrong (as well as the Java exception error) and then quits the program. The user will then have to rerun the program. 

The second level of input validation is boundary validation. In which the given input is checked if it meets requirements specified in the assignment:
    - Sales Person Number: [1,5] (Between 1 and 5)
    - Product Number: [1,4] (Between 1 and 4)
    - Amount: Must be greater than or equal to 0 (No Negative numbers)
If any of the given data does not meet the validation, the program will print that it is invalid and will then quit. The user will have to rerun the program

At the end of these three inputs, the program tabulates the data then it will ask if the user wants to continue inputting data. This is given by a input for either Y/N or y/n. Where Y/y is to continue data input, and N/n is to move onto tabuling data and calculations/printing. If the input given here is not either Y/y or N/n the program moves onto calculations and printing

For printing, I used the printf functions to print out formatted headers for the table, as well as used the function to format the tabulated and computed values. I used a set of nested for loops to navigate the rows and columns of my 2D array. 

After the program prints out the table, it will automatically exit
