# JAVA Programming Solutions
## Project Summary
Here, I have solved 11 Programming Problems using JAVA.

## Problems Description &  Short Note of Solving Approach

### Question 1
Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
Find out who achieved the 2nd highest score. (without sorting, use linear searching algorithm)

### Approach:
Initializing “HighestCgpa” and “SecondHighestCgpa” with the first index of CGPA. As I have gone through each CGPA, if it is higher than “HighestCgpa”, assign “HighestCgpa” to “SecondHighestCgpa” and update “HighestCgpa”. Otherwise, if it’s greater than “SecondHighestCgpa”, update “SecondHighestCgpa”. Once done, “SecondHighestCgpa” holds the second highest CGPA.

### Question 2
Sort the above scores from according to the order of highest CGPA (don’t use Arrays.sort() method, do it programmatically).

### Approach:
 I have initialized an array with the CGPA scores. Using a nested loop to compare each CGPA, swapping values whenever a CGPA is smaller than the next one to gradually arrange all elements in descending order. After the loop finishes, the array will be sorted in descending order.

 ### Question 3
 Take a CGPA as user input. Now from the given array find if your input CGPA is present using binary search algorithm
 
 ### Approach:
 Here have to take a CGPA input from the user and check if it exists in a predefined array of CGPAs using binary search. The array is first sorted, then a function called “binarySearch” is used for iterating to find the target CGPA by dividing the search space in half each time. If the CGPA is found, it returns the index, otherwise, it returns -1 to indicate absence. Finally, based on the result, a message is displayed to the user confirming whether the CGPA exists in the array.
 
 ### Question 4
 Generate random 10 integer numbers in an array and print out all the numbers from the array and also print the max and min number from the array.
 
 ### Approach:
 To solve this, I created an array to store 10 randomly generated integers. I initialized `max` and `min` variables to track the highest and lowest values, starting with “Integer.MIN_VALUE” and “Integer.MAX_VALUE”, respectively. “Integer.MAX_VALUE” is the largest value an `int` can hold in Java, equal to 2,147,483,647. It’s useful for initializing variables when searching for the minimum value in a set, ensuring any number will be smaller. 
 After generating the numbers and storing them in the array, I looped through the array to update “max” if a value was higher and “min” if it was lower. Finally, I printed the array, along with the maximum and minimum values identified.

 ### Question 5
 Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:
 
 notes=[1000,500,200,100,50,20,10,5,2,1] 
 
 Input: 546

 Output:

 500 1

 20 2

 5 1

 1 1
 
 ### Approach:
 We start with an array holding all the note values, ordered from highest to lowest. For each note, we divide the `amount` by the note’s value to find how many of that note we need. Then, we use the modulo operator to update the `amount` with the remainder. This process is repeated for each note in the array until we break down the entire `amount` into the smallest number of notes.
 
 ### Question 6
 Write a program that will give following output:
 
 12345 

 1234

 123 

 12 

 1

 12 

 123 

 1234

 12345
 
 ### Approach:
 This code uses two nested loops to create a pattern of numbers. The first set of loops prints the top half of the pattern, starting with `5` columns in the first row and reducing down to `1` column. The second set of loops then builds the lower half, starting from `2` columns and increasing up to `5` columns. Each row prints numbers from `1` up to the current row number, forming a symmetrical pattern.
 
 ### Question 7
 Take input as height of 10 babies in cm. Now find out the 2 lowest height of babies. (Don’t use Arrays.sort() method).
 
 ### Approach:
 To find the two lowest heights among the 10 babies, first I have initialized two variables to hold the lowest and second-lowest heights, setting them to a very high value. Inputting each height and comparing it against these variables to update them accordingly. Here I have used a for loop for taking input and another for loop to determine the two lowest heights without sorting the entire array. Finally, I have printed the array of heights and the two lowest heights from the array.
 
 ### Question 8
 Count number of words, number of characters without spaces, number of vowels and consonant from the given string.
 
 Input: I am a SQA Engineer
 
 Output:
 
 Words: 5
 
 Chars: 15
 
 Vowel: 8
 
 Consonant: 7
 
 ### Approach:
 This problem analyzes a given string by counting the words, characters, vowels, and consonants. First have to split the string into words and count them, then convert each character to lowercase and check if it’s a vowel or consonant, updating respective counters. Finally, it prints the total counts for words, characters, vowels, and consonants. 
 
 ### Question 9
 Find the number of occurrences of characters in a String.

 String: I live in Dhaka

 Output:

 i 3

 l 1

 v 1

 e 1

 d 1

 h 1

 a 2

 k 1
 
 ### Approach:
 Here, firstly have to convert the string to lowercase using “toLoweCase()” and convert it to array using “toCharArray()” method, then I have used a `LinkedHashMap` to store each character (ignoring spaces) along with its frequency. Each character's count is incremented by 1 if it already exists in the map. Finally, the map is printed in insertion order as we have used LinkedHashMap instead of HashMap and displayed each character with its count.
 
 ### Question 10
 Print the  numbers which are not duplicate from the given array.
 
 numbers=[1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7]

 Output:

 3, 6, 7
 
 ### Approach:
 This problem is about removing duplicate values from an array while preserving unique elements. Firstly, have to add each element to a “LinkedHashSet” to track all numbers, and if an element is already present, it is added to another set of duplicates. Finally, duplicates are removed from the original set, leaving unique elements, which are then printed.
 
 ### Question 11
 Remove Vowels from a String.

 Input: I am a SQA Engineer

 Output: m sq ngnr

 ### Approach
 Here, for removing vowels from a given string, first I have converted the string to lowercase and then iterating through each character. It uses a “StringBuilder” to build a new string, checking each character to see if it’s a vowel. If the character isn’t a vowel, it’s appended to the StringBuilder. Finally, the result without vowels is printed.
 
