# Pseudocode

## Part 1
```
Define a sentence variable as a string

Define function with a parameter of input string:
  Define an array of words
  Set array to input string that's split on space character
  
  Define a longest word and set it to null
  Define a longest word length and set it to 0
  For every word:
    Define current word length to length of word
    If current word length > longest word length:
      Set longest word length to current word length
      Set longest word to current word
  
  Return the longest word

Call the function, passing the sentence variable
```


```
Set variable paragraph to “blah blahh blahhh”
Split paragraph into words
Set variables for longest word and longest length, initialized to empty string & 0
For each word:
  If word’s length > longest length:
    # What about ties?
    Set longest word to word
    Set longest length to word’s length
Print longest word and longest length (or word’s length, which is equivalent)
```




## Part 2
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
