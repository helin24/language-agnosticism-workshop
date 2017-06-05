# Pseudocode

## Part 1
```
Define a sentence variable as a string, e.g. "This is a long sentence with words of multiple lengths for inputting into your function"

Split the input string on every space character to get an array of words

Define a longest word variable set to an empty string

For every word:
  If the length of the current word > length of longest word:
    Set the longest word to current word

Print the longest word
```

## Part 2
```
Define a function that takes an input of a sentence:
  Split the input string on every space character to get an array of words

  Define a longest word variable set to an empty string

  For every word:
    If the length of the current word > length of longest word:
      Set the longest word to current word

  Return the longest word (instead of printing)


Define a sentence variable as a string
Print the result of calling function with sentence as input
```

## Part 3
```
Define a sentence variable as a string

Define function with a parameter of input string:
  Define an array of words
  Set array to input string that's split on space character

  Define an empty result hash for eventually storing {letter count: [words]}

  For every word in the array:
    Calculate current word length
    
    If the result hash does not have the current word length yet:
      Add to result hash the key value pair word length: empty array (or set if we want unique words)
    
    Find the value associated with the current word length (should be an array)
    Append the current word to the array

  Return the result hash

Call the function, passing the sentence variable
```

