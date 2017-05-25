function findLongestWord(sentenceString) {
  var longestWord = '';

  //note that this is imperfect for punctuation
  words = sentenceString.split(" ");
  for (var i = 0; i < words.length; i++) {
    if (words[i].length > longestWord.length) {
      longestWord = words[i];
    }
  }

  return longestWord;
}

var sentenceString = "This is a long sentence with words of multiple lengths for inputting into your function.";
var longestWord = findLongestWord(sentenceString);
console.log('Longest word is ' + longestWord + ' at a length of ' + longestWord.length);
