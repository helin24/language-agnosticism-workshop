import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class WordLengthSorter {
  public static void main(String[] args) {
    String mySentence = "Hello, I am a sentence with many different word lengths.";    
    printWordsByLength(mySentence);
  }
  
  public static void printWordsByLength(String sentence) {
    String[] words = sentence.split(" ");
    Map<Integer, List<String>> wordsByLength = new HashMap<>();
    
    for (int i = 0; i < words.length; i++) {
      int currentWordLength = words[i].length();

      if (!wordsByLength.containsKey(currentWordLength)) {
        wordsByLength.put(currentWordLength, new ArrayList<String>());
      }
           
      wordsByLength.get(currentWordLength).add(words[i]);
    } 
        
    wordsByLength.forEach((length, listOfWords) -> {
      System.out.println(length);

      listOfWords.forEach(word -> {
        System.out.println(word);
      });
               
      System.out.println("\n");
    });
  }
}

