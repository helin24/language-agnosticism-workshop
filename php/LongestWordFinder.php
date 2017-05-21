<?php

$sentence = "This is a long sentence with words of multiple lengths for inputting into your function.";

$words = explode(" ", $sentence);

$longest_word = "";

foreach($words as $word) {
    if (strlen($word) > strlen($longest_word)) {
        $longest_word = $word;
    }
}

print $longest_word . "\n";

