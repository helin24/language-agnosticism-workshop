# Java Part 1 Hints
- Code must be run in a `main` method inside a class - this is the 'entry point' of your code.
  ```
  class LongestWordFinder {
    public static void main(String[] args) {
      // Your code here
    }
  }
  ```

- Java is 'strongly typed', which means that every variable must have a type. Whenever you want to use a variable, you must declare its type and only assign data of that type.
  ```
  // Correct:
  int num = 5;
  num = 17;

  // INCORRECT:
  int num = 5;
  num = "changed my mind..."
  ```
  
  - Arrays are declared with brackets `[]` following the type of data contained in the array. For an array of integers, you would declare `int[] array_of_ints;`

- Methods that may be useful:
  - Splitting a string into an array of strings
  - Finding the length of a string
  - Finding the length of an array
- Iteration can be done using a `for` loop
