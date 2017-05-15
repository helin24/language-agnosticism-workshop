public class LongestWordFinder {
  public static void main(String[] args) {
    String mySentence = "Hello, I am a sentence with many different word lengths.";
      System.out.println(longestWord(mySentence));
  }
      
  public static String longestWord(String sentence) {
    String[] words = sentence.split(" ");
    String longestSoFar = "";
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > longestSoFar.length()) {
        longestSoFar = words[i];
      }
    }
    return longestSoFar;
  }
}

