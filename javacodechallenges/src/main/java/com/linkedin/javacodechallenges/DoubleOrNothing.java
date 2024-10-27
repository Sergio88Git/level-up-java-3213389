public class DoubleOrNothing {

  public void playGame() {
    // TODO: Implement method
    int points = 10;
    char answer = ' ';
    while (points > 0 && answer !='q') {

      System.out.println("You have "+points+" points.");
      System.out.println("(D)ouble or (q)uit ?");
      do {
        input answer;
      } while (answer != 'd' && answer != 'q')
    }
  }
}