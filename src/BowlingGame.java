public class BowlingGame {
  private int score;
  private int[] scores = new int[21];
  private int rollNumber;

  public BowlingGame() {
    this.score = 0;
    this.rollNumber = 0;
  }

  public void roll(int i) {
    scores[rollNumber] = i;
    rollNumber++;
  }

  public int score() {
    for (int i = 0; i < 20; i++) {
      if (scores[i] + scores[i + 1] == 10) {
        score += (10 + scores[i + 2]);
        i++;
      } else if (scores[i] == 10) {
        score += (10 + scores[i + 1] + scores[i + 2]);
      } else {
        score += scores[i];
      }
    }
    return score;
  }
}