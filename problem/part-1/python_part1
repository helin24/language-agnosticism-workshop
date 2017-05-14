def find_longest_word(sentence_string):
  longest_word = ''
  longest_length = 0

  words = sentence_string.split()
  for word in words:
    if len(word) > longest_length:
      longest_length = len(word)
      longest_word = word
    
  print 'Longest word is {} at a length of {}'.format(longest_word, longest_length)

sentence_string = "This is a long sentence with words of multiple lengths for inputting into your function"
find_longest_word(sentence_string)
