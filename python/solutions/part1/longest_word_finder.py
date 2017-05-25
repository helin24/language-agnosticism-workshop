sentence_string = "This is a long sentence with words of multiple lengths for inputting into your function"
longest_word = ''

words = sentence_string.split()
for word in words:
	if len(word) > len(longest_word):
		longest_word = word

print 'Longest word is {} at a length of {}'.format(longest_word, len(longest_word))
