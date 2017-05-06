function findLongestWord(sentenceString) {
  var longestWord = '';
  var longestLength = 0;

  //note that this is imperfect for punctuation
  words = sentenceString.split(" ");
  for (var i = 0; i < words.length; i++) {
    if (words[i].length > longestLength) {
      longestLength = words[i].length;
      longestWord = words[i];
    }
  }

  console.log('Longest word is ' + longestWord + ' at a length of ' + longestLength);
}

var sentenceString = "This is a long sentence with words of multiple lengths for inputting into your function.";
findLongestWord(sentenceString);
