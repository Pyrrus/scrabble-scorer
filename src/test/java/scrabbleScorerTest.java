import org.junit.*;
import static org.junit.Assert.*;

public class scrabbleScorerTest {
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    scrabbleScorer testScrabble = new scrabbleScorer();
    long expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    scrabbleScorer testScrabble = new scrabbleScorer();
    long expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_3() {
    scrabbleScorer testScrabble = new scrabbleScorer();
    long expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_4() {
    scrabbleScorer testScrabble = new scrabbleScorer();
    long expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_5() {
    scrabbleScorer testScrabble = new scrabbleScorer();
    long expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_6() {
    scrabbleScorer testScrabble = new scrabbleScorer();
    long expected = 8;
    assertEquals(expected, testScrabble.calculateScore("j"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_7() {
    scrabbleScorer testScrabble = new scrabbleScorer();
    long expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
  }
}
