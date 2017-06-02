def longest_word(sentence)
  words = sentence.split(" ")
  longest_word = ""
  
  words.each do |word|
      if word.length > longest_word.length
          longest_word = word
      end
  end

  longest_word
end

first_sentence = "This is a long sentence with words of multiple lengths for inputting into your function."
puts "The longest word of the first sentence is: " + longest_word(first_sentence)
second_sentence = "Now that we have a function, we can test other sentences without difficulty!"
puts "The longest word of the second sentence is: " + longest_word(second_sentence)

