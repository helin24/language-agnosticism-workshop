# Pseudocode

## Part 1
```
Define a sentence variable as a string

Split the input string on every space character to get an array of words

Define a longest word variable set to an empty string

For every word:
  If the length of the current word > length of longest word:
    Set the longest word to current word

Print the longest word
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

Count frequency rather than length:
      
```
Set variable paragraph to “blah blah blah”
Make a dictionary for the words and their lengths
For every word in the paragraph:
  If it’s already in the dictionary, add 1 to its value
  If it’s not in the dictionary, add it with a value of 1
Set a variable for the highest frequency to 0
Set a variable for the most frequent word
For every word (key) in the dictionary:
  If its value is > the current highest frequency:
    Set highest frequency to its value
    Set most frequent word to the key
Print out most frequent word and highest frequency
```
