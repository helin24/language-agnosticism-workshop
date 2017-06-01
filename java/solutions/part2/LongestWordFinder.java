public class LongestWordFinder {
  public static void main(String[] args) {
    String mySentence = "Hello, I am a sentence with many different word lengths.";
    System.out.println("The longest word in the sentence -- " + mySentence + " -- is....\n");
    System.out.println(longestWord(mySentence));

    String secondSentence = "Now that I have a function, I can use it for many more sentences!";
    System.out.println("The longest word in the sentence -- " + secondSentence + " -- is....\n");
    System.out.println(longestWord(secondSentence));
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

