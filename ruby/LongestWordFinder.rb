sentence = "This is a long sentence with words of multiple lengths for inputting into your function."

words = sentence.split(" ")
longest_word = ""

words.each do |word|
    if word.length > longest_word.length
        longest_word = word
    end
end

puts longest_word

