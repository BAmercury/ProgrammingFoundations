ba555
Bhautik Amin
Drexel ID: 13618816
CS570 Assignment 8: Stack Data Structures

The contents of my submission are:
    - ba555_hw8.java (main driver code)
    - Data.txt (Input test cases)

Test Cases:
I randomly put together 20 test cases for proper and improper expressions

The Program:

My main program runs through the following:
    1. Read in file (Called Data.txt and must be in the same directory as the program)
        - Using the Scanner Object
    2. Save file strings to a list
        - Using the ArrayList class
    3. Iterate through list and send strings to check if its balanced (using a stack)
        - For loop and a method I wrote called CheckBal (Furthur explanation of this method to follow)
    4. Save result string to a new list that will be used to print to file (called Output.txt)
        - Using ArrayList class again and the FileWriter object

The CheckBal method:

My method takes in a string and returns a boolean detailing if it's properly balanced or improperly balanced
It runs through the following:
    1. Iterate through characters of the string and check if it's a left or right paranthesis
    2. Check if character matches a left paranthesis: '(', '{', or '['
        2a. If it does, add this to a Stack data structure (Using the default Java stack class)
    3. Check if the character matches a right paranthesis
        3a. If it is, then use the stack's peek() method to check if it's partner is on top of the stack
        Stack's are last in, first out. So the most recent, topmost addition to the stack should be the partner
        Also, check if the stack is empty, if it's empty - that means that this right paranthesis does not have a partner
        and the expression is not balanced. 
        If a partner is found, then pop/remove the partner from the stack and continue on
    4. Return the final result


File IO Error handling:
For writing and reading files, I implemented two try-catch blocks that will output to the user if there was
an issue reading Data.txt or writing to Output.txt. The program will quit and the user will have to restart after
checking both of these files



For my given test case data, here is what the Output file looked like when I ran my program:
Output File:
(25 * 5) * [{45 / 2} - 500]:	proper
(((50 / 7)):	proper
25 * 5:	proper
(25 * 5):	proper
[600 * / 4 {0000} + {324324}]:	proper
[600 * / 4 0000} + {324324}{:	improper
(800) * [90]] - {600} + (234):	improper
(800 + 900)      0 - {600}:	proper
({[200 - 400]}):	proper
{{{(((500 - 600)))}}}:	proper
{6 - 4}]:	improper
(45 / 45 * {{(54 ** {62}}})):	improper
34 * 43 / 56 + 900:	proper
(43 * 43) 8 * 56 / 900:	proper
89 * (900 + 500) / {600} * [700]:	proper
89 * 89 - {{[[)982]]}}:	improper
{400 * 500} * [[155]]:	proper
500 - 400 * {((((400))):	proper
(600 - {500}):	proper
{500 - (700)}:	proper

