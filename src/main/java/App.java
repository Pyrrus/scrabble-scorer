import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {

    Console myConsole = System.console();
    System.out.println("Enter a word:");
    String stringUserWord = myConsole.readLine();
    scrabbleScorer word = new scrabbleScorer();
    //List<Object> scrabbleScorerResult = word.calculateScore(stringUserWord);
    System.out.println(word.calculateScore(stringUserWord));

  }
}
