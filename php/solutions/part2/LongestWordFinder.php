<?php

function longest_word($sentence) {
  $words = explode(" ", $sentence);
  
  $longest_word = "";
  
  foreach($words as $word) {
      if (strlen($word) > strlen($longest_word)) {
          $longest_word = $word;
      }
  }

  return $longest_word;
}

$first_sentence = "This is a long sentence with words of multiple lengths for inputting into your function.";
print "The longest word in the first sentence is: " . longest_word($first_sentence) . "\n";

$second_sentence = "Now that we have a function, we can test multiple sentences without difficulty!";
print "The longest word in the second sentence is: " . longest_word($second_sentence) . "\n";

