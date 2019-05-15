CS570 Assignment 5
ba555
Bhautik Amin
Drexel ID: 13618816

My submission contains two Java programs:
    - ba555_hw5p1.java
    - ba555_hw5p2.java

Both programs are designed with a main program loop that will:
    - first prompt user for a word
    - evaluate that word if it is a palindrome
    - Prompt user if they want to test a new word (The user will be prompted to input 'Y' or 'N', but the
    program is also designed to accept lowercase 'y' or 'n'. In the case neither of these inputs are given
    by default the program will continue on again)
    - either loop again for exit the program based on the previous control input

For palindrome evaulation the criteria for both the iterative (ba555_hw5p1) and recursive (ba555_hw5p2)
solutions is to go through both sides of a given string and check to see if they are not equal. If they are not equal
at any conjugate points throughout the string, then it is not a palindrome. For both iterative and recursive methods
if a given string is 0 or 1 characters long ( less than 2 ) it automatically qualifies as a palindrome and will return true

Part 1 contains my solution for the iterative program for palindrome evaluation. My method uses two 'pointer'
variables that are used to navigate the beginning characters and end characters of a given word. I use a while loop to cycle
through iterations of the word, and my conditional statement to break the while loop and return a result is a check to see
if the characters are not equal to each other (not a palindrome). 

Part 2 contins my solution for the recursive program for palindrome evaluation. For my solution here, I start off with a similar evaluation
of if the string is less than and not equal to 2 characters, it automatically qualifies as a palindrome (Same start for the iterative method). 

From there, I go again with a similar evaluation as the iterative method, where I check to see if the first char and last char are not the same, 
if they are not the same - then the given string is not a palindrome. 

This is my base method, I can input a string and it will essentially give me true/false 
if the first and last indices do/don't match. 

For recursion, I will have to continouly call this method again, so by trimming the first and last char's (the
ones that were just evaluated), the method can rescursively go through each conjugate pair 
within the string and evaluate to see if the given string is a palindrome. For trimming I used a for loop 
that starts from the NEXT index of the given string, and appends charcters onto a new "trimmed" string variables
up to but not AT the last index (not inclusive). So the trimmed string will have the conjugate pairs that still yet to be
evaluated. The method will rescursively call on itself until the string cannot be trimmed anymore
