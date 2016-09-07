class scrabbleScorer {
  private long total;

  public void scrabbleScorer() {
    total = 0;
  }

  public long calculateScore(String word) {
    String lower = word.toLowerCase();
    for (int i = 0; i < lower.length(); i++) {
      char at = lower.charAt(i);

      if (at == 'a' || at == 'e' || at == 'i' || at == 'o' || at == 'u' || at == 'l' || at == 'n' || at == 'r' || at == 's' || at == 't') {
        total += 1;
      } else if (at == 'd' || at == 'g') {
        total += 2;
      } else if (at == 'b' || at == 'c' || at == 'm' || at == 'p') {
        total += 3;
      } else if (at == 'f' || at == 'h' || at == 'v' || at == 'w' || at == 'y') {
        total += 4;
      } else if (at == 'k') {
        total += 5;
      } else if (at == 'j' || at == 'x') {
        total += 8;
      } else if (at == 'q' || at == 'z') {
        total += 10;
      }
    }

    return total;
  }
}
