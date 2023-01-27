# Laboration 1
The aim of this lab is write pseudocode and implementation for a program that reads customer data from a .txt file,
extract relevant data and print the information to console using two different programming styles; 
imperative and declarative. This exercise is meant to provide training for imperative and declarative
programing paradigm, the use of regular expressions and writing pseudocode.

# Procedures
First, the following pseudocode was written;

**Pseudocode**

#Reads data from file, extract relevant information and print to console

1. fileReaderVariable <- **Initialize** a file Reader

2. container <- **Initialize** a container

3. **while** not End of file

4. * readline

5. * **Add** line to container

6. count = 0

7. **while** count is not greater than the size of containerVariable

8.   * **Print** line in container at index = count, count + 1, count + 3

9.   * **increment** count by 6

Secondly, the pseudocode was implemented using the imperative programming style in java. 
The code is implemented within the imperativeSolution() method in the provided lab skeleton program 
A bufferReader was used to read the file and an ArrayList was used as a container. 
The lines where read within a while loop with the condition that checks for end of file by 
by checking that the result of the readline is not null. Starting with a count of 0, the lines at positions 
equals to count, count, count + 1 and count + 3 are printing which correspond to the 
Customer ID, Name and Phone number. Then the count is increased by six because each customer data 
occupies five line and there is an empty line between each customer entry according to the given file format. 
This is repeated until the whole list is read and count is greater than the size of the list. 

Next, the implementation is written for the declarativeSolution() method which produces the same result as the 
imperativeSolution() method but using the declarative programming style. The Stream API was used which enables 
operators to be linked. The file was read using a BufferReader using the method lines and the resulting stream is filtered using the regex 
expression "(^Customer ID: \\d{3})|(^Name: \\w+\\s\\w+)|(^Phone: \\d{3}-\\d{3}-\\d{4})" and the resulting 
stream is printed using the Stream ForEach operator.
# Discussion
The submitted program fulfills the purpose of this exercise. The pseudocode is provided as part of 
the procedure and is also found as a comment int he solution file. The Code within imperativeSolution() is written using 
iterations and controls in accordance the imperative style and the 
method reads customer data, extract the customer id, name and phone number and prints to the console. The methods declarativeSolution() 
produces the same result but the code is a chain of operations with no iterations or condition statements, using only calls to operators and regular 
expressions to read, extract and print information which is in accordance with the declarative style. A string built using regular expressions was used 
together with the filter operator to extract relevant data. The solution presented 
was the best I could think and fulfill the requirements of the exercise.  However, it is worth mentioning 
that the solution present assumes that the Customer ID is a three-digit number, the name is always in the two names 
format and the phone number is always in format xxx-xxx-xxxx where x is a digit as shown in the file format example 
in the lab description. 


