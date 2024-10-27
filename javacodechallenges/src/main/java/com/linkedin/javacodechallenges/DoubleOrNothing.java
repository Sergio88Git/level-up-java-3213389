package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {
    // TODO: Implement method
    int points = 10;
    char answer = ' ';
    Scanner input = new Scanner(System.in);
    while (points > 0 && answer != 'q') {

      System.out.println("You have " + points + " points.");
      do {
        System.out.println("(d)ouble or (q)uit ?");
        answer = input.next().charAt(0);
      } while (answer != 'd' && answer != 'q');
      if (answer == 'd') {
        if (Math.random() >= 0.5) {

          System.out.println("You won !");
          points = points * 2;
        } else {
          System.out.println("you lose !");
          points = 0;
        }

      } else {
        System.out.println("Bye !");
      }

    }
    System.out.println("You have " + points + " points.");
    input.close()
  }
}