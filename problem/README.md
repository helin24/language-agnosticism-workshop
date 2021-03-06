## Problem Description
Note that all of the code samples below are pseudocode.

### Part 1
Start with a sentence, and write code that prints out the longest word. It should work roughly like this:
```
sentence = "This is a long sentence with words of multiple lengths for inputting into your function"

# Add some code here!
# more code
# and then it should print out...

# => "inputting"
```
*Note that we don't care about ties. If there are two equal-length words, print either one!*

### Part 2
Since we don't want to copy and paste the code from Part 1 every time we need the longest word, create a **function** that encapsulates your code. Something like...
```
sentence = "This could be any sentence"

define function longest_word_from_sentence(sentence_string):
  # Add your code here!
end

# Then use your function...
longest_word_from_sentence(sentence)

# => "sentence"

# And you can keep using it on other sentences!
another_sentence = "This is a more loquacious sentence"
longest_word_from_sentence(another_sentence)

# => "loquacious"
```

### Part 3
Modify your function to group words by how many letters they have, and print out the groups.
```
sentence_string = "This is a long sentence with words of multiple lengths for inputting into your function"

print_groups_by_length(sentence_string)

# 1
# a
# 
# 2
# is
# of
#
# 3
# for
...
# 9
# inputting
```

### Part 4
Modify your function to grab user input for the string to analyze rather than taking in an argument.

### Part 5
There are unlimited ways to analyze a group of words - think of other ways to analyze sentences and do it in your function!

## Using Resources

We provide solutions in the directory for each language. If you get stuck, feel free to look at these for ideas on how to solve the problem. But they're certainly not the only possible way to solve this problem!

The language directories also contain a README with the link to an online code editor for you to use and some helpful resources, as well as a file of hints you can reference.

